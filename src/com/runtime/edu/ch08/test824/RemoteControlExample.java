package com.runtime.edu.ch08.test824;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new Television();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		RemoteControl.changeBattery();
	}

}
