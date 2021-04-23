*******************************************
* Configuration: 12 cars and 4 rounds. *
*                                                          *
*******************************************

------------------------------------------------------------------------------------------------------------------
Explanation: 
Based on the Synch class, we could see that there are two more Semaphores are created:"eastBoundCar" 
and "westBoundCar", which is going to queue the cars from each side of road. Also, in the TrafficLight 
class, cars could drive throught the causeway only when traffic light ontheir side are GREEN. Moreover, 
in Car class, every step of driving, including driving around Barriefield, driving through causeway in 
eastbound, and driving to petrol station, etc are counted by an integer called "totalCars", so that each car 
could be tracked easily. According to the output between, we could obviously obeserve that each car starts 
in Barriefield, crossthe causeway westbound into Kingston, then enters a petrol station to fill the car with petrol, 
then leaves the petrol station and cross the causeway eastbound back into Barriefield for totally four rounds. 
Overall, I think my synchronization works properly.

-------------------------------------------------------------------------------------------------------------------

******************
*     Output       *
******************
At time 0 Car 2 is driving around Barriefield.

At time 0 Car 8 is driving around Barriefield.

At time 0 Car 6 is driving around Barriefield.

At time 0 Car 5 is driving around Barriefield.

At time 0 Car 4 is driving around Barriefield.

At time 0 Car 3 is driving around Barriefield.

At time 0 Car 1 is driving around Barriefield.

At time 0 Car 9 is driving around Barriefield.

At time 0 Car 11 is driving around Barriefield.

At time 0 Car 10 is driving around Barriefield.

At time 0 Car 7 is driving around Barriefield.

At time 0 Car 12 is driving around Barriefield.

At time 61 Car 10 wants to cross westbound.

At time 61 Car 10 is starting to cross westbound.

This is main speaking
At time 66 Car 7 wants to cross westbound.

At time 93 Car 11 wants to cross westbound.

At time 153 Car 6 wants to cross westbound.

At time 159 Car 5 wants to cross westbound.

At time 161 Car 10 is filling the car fuel tank at the petrol station.

At time 162 Car 4 wants to cross westbound.

At time 271 Car 2 wants to cross westbound.

At time 274 Car 9 wants to cross westbound.

At time 280 Car 1 wants to cross westbound.

At time 281 Car 7 is starting to cross westbound.

At time 360 Car 12 wants to cross westbound.

At time 360 Car 12 is starting to cross westbound.

At time 381 Car 7 is filling the car fuel tank at the petrol station.

At time 432 Car 3 wants to cross westbound.

At time 460 Car 12 is filling the car fuel tank at the petrol station.

At time 478 Car 8 wants to cross westbound.

At time 588 Car 10 wants to cross eastbound.

At time 588 Car 10 is starting to cross eastbound.

At time 611 Car 7 wants to cross eastbound.

At time 611 Car 7 is starting to cross eastbound.

At time 688 Car 10 is driving around Barriefield.

At time 711 Car 7 is driving around Barriefield.

At time 720 Car 10 wants to cross westbound.

At time 722 Car 11 is starting to cross westbound.

At time 822 Car 11 is filling the car fuel tank at the petrol station.

At time 870 Car 12 wants to cross eastbound.

At time 870 Car 12 is starting to cross eastbound.

At time 941 Car 11 wants to cross eastbound.

At time 943 Car 11 is starting to cross eastbound.

At time 970 Car 12 is driving around Barriefield.

At time 1043 Car 11 is driving around Barriefield.

At time 1152 Car 11 wants to cross westbound.

At time 1164 Car 6 is starting to cross westbound.

At time 1206 Car 7 wants to cross westbound.

At time 1206 Car 7 is starting to cross westbound.

At time 1264 Car 6 is filling the car fuel tank at the petrol station.

At time 1306 Car 7 is filling the car fuel tank at the petrol station.

At time 1448 Car 7 wants to cross eastbound.

At time 1448 Car 7 is starting to cross eastbound.

At time 1461 Car 12 wants to cross westbound.

At time 1548 Car 7 is driving around Barriefield.

At time 1606 Car 5 is starting to cross westbound.

At time 1672 Car 6 wants to cross eastbound.

At time 1672 Car 6 is starting to cross eastbound.

At time 1706 Car 5 is filling the car fuel tank at the petrol station.

At time 1772 Car 6 is driving around Barriefield.

At time 1903 Car 7 wants to cross westbound.

At time 2048 Car 4 is starting to cross westbound.

At time 2147 Car 6 wants to cross westbound.

At time 2147 Car 6 is starting to cross westbound.

At time 2148 Car 4 is filling the car fuel tank at the petrol station.

At time 2170 Car 5 wants to cross eastbound.

At time 2170 Car 5 is starting to cross eastbound.

At time 2237 Car 4 wants to cross eastbound.

At time 2247 Car 6 is filling the car fuel tank at the petrol station.

At time 2269 Car 4 is starting to cross eastbound.

At time 2270 Car 5 is driving around Barriefield.

At time 2331 Car 5 wants to cross westbound.

At time 2369 Car 4 is driving around Barriefield.

At time 2490 Car 2 is starting to cross westbound.

At time 2590 Car 2 is filling the car fuel tank at the petrol station.

At time 2638 Car 6 wants to cross eastbound.

At time 2711 Car 6 is starting to cross eastbound.

At time 2791 Car 4 wants to cross westbound.

At time 2811 Car 6 is driving around Barriefield.

At time 2932 Car 9 is starting to cross westbound.

At time 2951 Car 2 wants to cross eastbound.

At time 3032 Car 9 is filling the car fuel tank at the petrol station.

At time 3041 Car 9 wants to cross eastbound.

At time 3153 Car 2 is starting to cross eastbound.

At time 3233 Car 6 wants to cross westbound.

At time 3253 Car 2 is driving around Barriefield.

At time 3374 Car 1 is starting to cross westbound.

At time 3474 Car 1 is filling the car fuel tank at the petrol station.

At time 3509 Car 2 wants to cross westbound.

At time 3576 Car 1 wants to cross eastbound.

At time 3595 Car 9 is starting to cross eastbound.

At time 3695 Car 9 is driving around Barriefield.

At time 3816 Car 3 is starting to cross westbound.

At time 3916 Car 3 is filling the car fuel tank at the petrol station.

At time 4037 Car 1 is starting to cross eastbound.

At time 4119 Car 9 wants to cross westbound.

At time 4137 Car 1 is driving around Barriefield.

At time 4154 Car 1 wants to cross westbound.

At time 4195 Car 3 wants to cross eastbound.

At time 4258 Car 8 is starting to cross westbound.

At time 4358 Car 8 is filling the car fuel tank at the petrol station.

At time 4477 Car 8 wants to cross eastbound.

At time 4479 Car 3 is starting to cross eastbound.

At time 4579 Car 3 is driving around Barriefield.

At time 4700 Car 10 is starting to cross westbound.

At time 4800 Car 10 is filling the car fuel tank at the petrol station.

At time 4921 Car 8 is starting to cross eastbound.

At time 4973 Car 3 wants to cross westbound.

At time 5021 Car 8 is driving around Barriefield.

At time 5142 Car 11 is starting to cross westbound.

At time 5231 Car 10 wants to cross eastbound.

At time 5242 Car 11 is filling the car fuel tank at the petrol station.

At time 5268 Car 8 wants to cross westbound.

At time 5354 Car 11 wants to cross eastbound.

At time 5363 Car 10 is starting to cross eastbound.

At time 5463 Car 10 is driving around Barriefield.

At time 5584 Car 12 is starting to cross westbound.

At time 5659 Car 10 wants to cross westbound.

At time 5659 Car 10 is starting to cross westbound.

At time 5684 Car 12 is filling the car fuel tank at the petrol station.

At time 5759 Car 10 is filling the car fuel tank at the petrol station.

At time 5805 Car 11 is starting to cross eastbound.

At time 5905 Car 11 is driving around Barriefield.

At time 5938 Car 10 wants to cross eastbound.

At time 5983 Car 11 wants to cross westbound.

At time 6012 Car 12 wants to cross eastbound.

At time 6026 Car 7 is starting to cross westbound.

At time 6126 Car 7 is filling the car fuel tank at the petrol station.

At time 6159 Car 7 wants to cross eastbound.

At time 6247 Car 10 is starting to cross eastbound.

At time 6347 Car 10 is driving around Barriefield.

At time 6403 Car 10 wants to cross westbound.

At time 6468 Car 5 is starting to cross westbound.

At time 6568 Car 5 is filling the car fuel tank at the petrol station.

At time 6689 Car 12 is starting to cross eastbound.

At time 6789 Car 12 is driving around Barriefield.

At time 6910 Car 4 is starting to cross westbound.

At time 6925 Car 5 wants to cross eastbound.

At time 7010 Car 4 is filling the car fuel tank at the petrol station.

At time 7131 Car 7 is starting to cross eastbound.

At time 7206 Car 12 wants to cross westbound.

At time 7231 Car 7 is driving around Barriefield.

At time 7336 Car 4 wants to cross eastbound.

At time 7352 Car 6 is starting to cross westbound.

At time 7452 Car 6 is filling the car fuel tank at the petrol station.

At time 7561 Car 6 wants to cross eastbound.

At time 7573 Car 5 is starting to cross eastbound.

At time 7673 Car 5 is driving around Barriefield.

At time 7681 Car 7 wants to cross westbound.

At time 7794 Car 2 is starting to cross westbound.

At time 7826 Car 5 wants to cross westbound.

At time 7826 Car 5 is starting to cross westbound.

At time 7894 Car 2 is filling the car fuel tank at the petrol station.

At time 7926 Car 5 is filling the car fuel tank at the petrol station.

At time 8015 Car 4 is starting to cross eastbound.

At time 8115 Car 4 is driving around Barriefield.

At time 8217 Car 2 wants to cross eastbound.

At time 8227 Car 4 wants to cross westbound.

At time 8236 Car 9 is starting to cross westbound.

At time 8272 Car 5 wants to cross eastbound.

At time 8336 Car 9 is filling the car fuel tank at the petrol station.

At time 8457 Car 6 is starting to cross eastbound.

At time 8557 Car 6 is driving around Barriefield.

At time 8678 Car 1 is starting to cross westbound.

At time 8694 Car 9 wants to cross eastbound.

At time 8768 Car 6 wants to cross westbound.

At time 8768 Car 6 is starting to cross westbound.

At time 8778 Car 1 is filling the car fuel tank at the petrol station.

At time 8868 Car 6 is filling the car fuel tank at the petrol station.

At time 8899 Car 2 is starting to cross eastbound.

At time 8943 Car 6 wants to cross eastbound.

At time 8943 Car 6 is starting to cross eastbound.

At time 8999 Car 2 is driving around Barriefield.

At time 9043 Car 6 has stoped and its driver went out.

At time 9120 Car 3 is starting to cross westbound.

At time 9200 Car 1 wants to cross eastbound.

At time 9220 Car 3 is filling the car fuel tank at the petrol station.

At time 9312 Car 2 wants to cross westbound.

At time 9341 Car 5 is starting to cross eastbound.

At time 9441 Car 5 is driving around Barriefield.

At time 9554 Car 3 wants to cross eastbound.

At time 9562 Car 8 is starting to cross westbound.

At time 9662 Car 8 is filling the car fuel tank at the petrol station.

At time 9702 Car 5 wants to cross westbound.

At time 9715 Car 8 wants to cross eastbound.

At time 9783 Car 9 is starting to cross eastbound.

At time 9883 Car 9 is driving around Barriefield.

At time 9985 Car 9 wants to cross westbound.

At time 10004 Car 11 is starting to cross westbound.

At time 10104 Car 11 is filling the car fuel tank at the petrol station.

At time 10225 Car 1 is starting to cross eastbound.

At time 10325 Car 1 is driving around Barriefield.

At time 10339 Car 1 wants to cross westbound.

At time 10433 Car 11 wants to cross eastbound.

At time 10446 Car 10 is starting to cross westbound.

At time 10546 Car 10 is filling the car fuel tank at the petrol station.

At time 10667 Car 3 is starting to cross eastbound.

At time 10767 Car 3 is driving around Barriefield.

At time 10888 Car 12 is starting to cross westbound.

At time 10988 Car 12 is filling the car fuel tank at the petrol station.

At time 11034 Car 10 wants to cross eastbound.

At time 11093 Car 12 wants to cross eastbound.

At time 11109 Car 8 is starting to cross eastbound.

At time 11121 Car 3 wants to cross westbound.

At time 11209 Car 8 is driving around Barriefield.

At time 11330 Car 7 is starting to cross westbound.

At time 11430 Car 7 is filling the car fuel tank at the petrol station.

At time 11551 Car 11 is starting to cross eastbound.

At time 11552 Car 8 wants to cross westbound.

At time 11651 Car 11 is driving around Barriefield.

At time 11689 Car 11 wants to cross westbound.

At time 11764 Car 7 wants to cross eastbound.

At time 11772 Car 4 is starting to cross westbound.

At time 11872 Car 4 is filling the car fuel tank at the petrol station.

At time 11966 Car 4 wants to cross eastbound.

At time 11993 Car 10 is starting to cross eastbound.

At time 12093 Car 10 has stoped and its driver went out.

At time 12214 Car 2 is starting to cross westbound.

At time 12314 Car 2 is filling the car fuel tank at the petrol station.

At time 12435 Car 12 is starting to cross eastbound.

At time 12443 Car 2 wants to cross eastbound.

At time 12443 Car 2 is starting to cross eastbound.

At time 12535 Car 12 is driving around Barriefield.

At time 12543 Car 2 is driving around Barriefield.

At time 12656 Car 5 is starting to cross westbound.

At time 12756 Car 5 is filling the car fuel tank at the petrol station.

At time 12759 Car 2 wants to cross westbound.

At time 12759 Car 2 is starting to cross westbound.

At time 12857 Car 5 wants to cross eastbound.

At time 12859 Car 2 is filling the car fuel tank at the petrol station.

At time 12877 Car 7 is starting to cross eastbound.

At time 12977 Car 7 has stoped and its driver went out.

At time 13012 Car 12 wants to cross westbound.

At time 13068 Car 2 wants to cross eastbound.

At time 13098 Car 9 is starting to cross westbound.

At time 13198 Car 9 is filling the car fuel tank at the petrol station.

At time 13319 Car 4 is starting to cross eastbound.

At time 13419 Car 4 is driving around Barriefield.

At time 13435 Car 9 wants to cross eastbound.

At time 13435 Car 9 is starting to cross eastbound.

At time 13535 Car 9 is driving around Barriefield.

At time 13540 Car 1 is starting to cross westbound.

At time 13640 Car 1 is filling the car fuel tank at the petrol station.

At time 13761 Car 5 is starting to cross eastbound.

At time 13861 Car 5 has stoped and its driver went out.

At time 13874 Car 4 wants to cross westbound.

At time 13874 Car 9 wants to cross westbound.

At time 13955 Car 1 wants to cross eastbound.

At time 13982 Car 3 is starting to cross westbound.

At time 14082 Car 3 is filling the car fuel tank at the petrol station.

At time 14203 Car 2 is starting to cross eastbound.

At time 14303 Car 2 has stoped and its driver went out.

At time 14411 Car 3 wants to cross eastbound.

At time 14424 Car 8 is starting to cross westbound.

At time 14524 Car 8 is filling the car fuel tank at the petrol station.

At time 14606 Car 8 wants to cross eastbound.

At time 14645 Car 1 is starting to cross eastbound.

At time 14745 Car 1 is driving around Barriefield.

At time 14866 Car 11 is starting to cross westbound.

At time 14966 Car 11 is filling the car fuel tank at the petrol station.

At time 15087 Car 3 is starting to cross eastbound.

At time 15115 Car 11 wants to cross eastbound.

At time 15115 Car 11 is starting to cross eastbound.

At time 15175 Car 1 wants to cross westbound.

At time 15187 Car 3 is driving around Barriefield.

At time 15215 Car 11 has stoped and its driver went out.

At time 15243 Car 3 wants to cross westbound.

At time 15308 Car 12 is starting to cross westbound.

At time 15408 Car 12 is filling the car fuel tank at the petrol station.

At time 15529 Car 8 is starting to cross eastbound.

At time 15629 Car 8 is driving around Barriefield.

At time 15686 Car 12 wants to cross eastbound.

At time 15750 Car 4 is starting to cross westbound.

At time 15836 Car 8 wants to cross westbound.

At time 15836 Car 8 is starting to cross westbound.

At time 15850 Car 4 is filling the car fuel tank at the petrol station.

At time 15936 Car 8 is filling the car fuel tank at the petrol station.

At time 15971 Car 12 is starting to cross eastbound.

At time 16071 Car 12 has stoped and its driver went out.

At time 16192 Car 9 is starting to cross westbound.

At time 16281 Car 8 wants to cross eastbound.

At time 16292 Car 9 is filling the car fuel tank at the petrol station.

At time 16297 Car 4 wants to cross eastbound.

At time 16393 Car 9 wants to cross eastbound.

At time 16413 Car 8 is starting to cross eastbound.

At time 16513 Car 8 has stoped and its driver went out.

At time 16634 Car 1 is starting to cross westbound.

At time 16734 Car 1 is filling the car fuel tank at the petrol station.

At time 16836 Car 1 wants to cross eastbound.

At time 16855 Car 4 is starting to cross eastbound.

At time 16955 Car 4 has stoped and its driver went out.

At time 17076 Car 3 is starting to cross westbound.

At time 17176 Car 3 is filling the car fuel tank at the petrol station.

At time 17297 Car 9 is starting to cross eastbound.

At time 17397 Car 9 has stoped and its driver went out.

At time 17435 Car 3 wants to cross eastbound.

At time 17739 Car 1 is starting to cross eastbound.

At time 17839 Car 1 has stoped and its driver went out.

At time 18180 Car 3 is starting to cross eastbound.

At time 18280 Car 3 has stoped and its driver went out.



