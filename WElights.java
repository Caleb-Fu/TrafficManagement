
//This file defines class "WElights".

public class WElights {
	//there are total three types of lights: RED, WEST_GREEN, and EAST_GREEN.
	String current;
	
	public WElights() {
		current = "RED";
	}
	
	//This function is going to change the signal of traffic light by accepting one type of light.
	public void changeLight(String light) {
		current = light;
	}
	
	//This function is going to output the current light signal.
	public String getCurrent() {
		return current;
	}
}
