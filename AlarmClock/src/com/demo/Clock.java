package com.demo;

public class Clock {
	protected int Hours,Minutes,Seconds;
	public void tick() {
		Seconds=Seconds+1;
		Minutes=Minutes+Seconds/60;
		Hours=Hours+Minutes/60;
		
		Seconds=Seconds%60;
		Minutes=Minutes%60;
		Hours=Hours%24;
				
	}
	public void show() {
		System.out.println(Hours+ ":" +Minutes+ ":" +Seconds );
	}
}
