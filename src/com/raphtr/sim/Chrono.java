package com.raphtr.sim;

public class Chrono implements Runnable {

	private static int hour;
	
	@Override
	public void run() {
		while(true) {
			if (hour >= 24){
				hour = 0;
				hour++;
			}
				
		}
	}
		
	public static int getHour() {
		return hour;
	}
	
	public void setTime(int hour) {
		Chrono.hour = hour;
	}

}
