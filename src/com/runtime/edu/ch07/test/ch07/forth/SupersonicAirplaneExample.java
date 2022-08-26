package com.runtime.edu.ch07.test.ch07.forth;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		// 해당부분은 부모class와 자식 class 둘다 사용해야할 경우 사용
		// 자동차 기어 변속 개념으로 사용하면 될듯
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
		System.out.println("====================================");
		
		// 상수 파일 생성 후 코드
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
	}

}
