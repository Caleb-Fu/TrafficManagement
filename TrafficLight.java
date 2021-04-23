

//This file defines class "TrafficLight".

public class TrafficLight extends Thread {
	//create a traffic light to send signals.
	public static WElights WEtrafficLight = new WElights();
	
	public TrafficLight() {
		Synch.timeSim.threadStart();
	}
	
	public void run() {
		/*
		 * Traffic light will repeat in the following order:
		 * • the light is green for eastbound traffic for some time T.
		 * • Then the light is red in both directions for some time Q.
		 * • Then the light is green for westbound traffic for time T.
		 * • Then the light is red in both directions for time Q.
		 */
		while (Synch.totalCars>0) { //traffic light stops working when there are no cars on the road.
			
			//If 10 eastbound cars are waiting, then the semaphore Release should be sent 10 times.
			if (Synch.eastCarWaiting >= 10) {
				   for (int i=0; i<10; i++) {
					   Synch.westBoundCar.release(); //release the semaphore.
					   Synch.westCarWaiting --;
					   Synch.timeSim.doSleep(1);
				   }
			   }
			//traffic light turns GREEN to eastbound
			WEtrafficLight.changeLight("EAST_GREEN");
			for (int j=0; j<Synch.eastCarWaiting; j++) {
				Synch.eastBoundCar.release();
				Synch.eastCarWaiting --;
				Synch.timeSim.doSleep(1); //give time for cars to go thru the causeway.
			}	 
			Synch.timeSim.doSleep(120); //GREEN light will hold for 120 time units.
			
			//traffic light turns RED for both sides of road for 100 time units.
			WEtrafficLight.changeLight("RED");
			Synch.timeSim.doSleep(100);
			
			//traffic lights turns GREEN for westbound cars.
			WEtrafficLight.changeLight("WEST_GREEN");
			for (int j=0; j<Synch.westCarWaiting; j++) {
				Synch.westBoundCar.release();
				Synch.westCarWaiting --;
				Synch.timeSim.doSleep(1);
			}
			Synch.timeSim.doSleep(120);
			
			WEtrafficLight.changeLight("RED");
			Synch.timeSim.doSleep(100);
		}
		
		Synch.timeSim.threadEnd();// Let timeSim know that this thread has ended.
	}
	public static WElights getLight() {
		// This function is going to return the current light signal.
		return WEtrafficLight;
	}



}