package com.runtime.edu.ch07.first;

public class DmbCellPhone extends CellPhone {
//자식
	
	// 필드
	int channel;
	
	// 생성자 (명시적 생성자)
	DmbCellPhone (String model, String color , int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	DmbCellPhone () {
	}
	
	// 메소드
	public void turnOnDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신 종료.");
	}
}
