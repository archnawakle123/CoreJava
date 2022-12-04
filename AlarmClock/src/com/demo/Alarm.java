package com.demo;

public class Alarm extends Clock{
	private int SetSecond, SetMinutes, SetHours;
	public Alarm(int a,int b,int c) {
		SetHours=a;
		SetMinutes=b;
		SetSecond=c;
	}
	public void tick() {
		Seconds=Seconds+1;
		Minutes=Minutes+Seconds/60;
		Hours=Hours+Minutes/60;
		
		Seconds=Seconds%60;
		Minutes=Minutes%60;
		Hours=Hours%24;
		
		if(Hours==SetHours && SetMinutes==SetMinutes && Seconds==SetSecond)
			System.out.println("Its Working...........");
			System.out.println(Hours+ ":" +Minutes+ ":" +Seconds+ ""+SetHours+ ":" +SetMinutes+ ":" +SetSecond+ ":");
			
			
	}
		
	
}
