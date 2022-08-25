package com.runtime.edu.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// 부모클래스 생성 후 method 실행
		CellPhone cellphone = new CellPhone();
		
		cellphone.powerOn();
		cellphone.powerOff();
		
		// 자식클래스 생성 후 method 실행
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOnDmb(11);
		dmbCellPhone.changeChannelDmb(77);
		dmbCellPhone.turnOffDmb();
		
		// 자식클래스 생성 후 부모클래스의 method 실행
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone();
		
		dmbCellPhone2.sendVoice("난 너를 찾을 것이다.");
		dmbCellPhone2.recieveVoice("Good Luck");
		dmbCellPhone2.hangUp();
		
	}

}
