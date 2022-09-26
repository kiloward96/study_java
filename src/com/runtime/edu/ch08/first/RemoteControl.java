package com.runtime.edu.ch08.first;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	// abstract : 추상
	public abstract void turnOn();	
	void turnOff();
	void setVolume(int volume);
	
	// default
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static : 정적
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
