package com.runtime.edu.ch04;

public class SwitchExample {

	public static void main(String[] args) {

//		int num = 1;
//
//		switch (num) {
//			case 1:
//				System.out.println("1번이 나왔습니다.");
//				break;
//			case 2:
//				System.out.println("2번이 나왔습니다.");
//				break;
//			case 3:
//				System.out.println("3번이 나왔습니다.");
//				break;
//			default:
//				System.out.println("1,2,3이 아닙니다.");
//				break;
//		}
//		
		
		
		String position = "ㄴㄴ";
		
		switch (position) {
		case "사원":
			System.out.println("연봉 3000");
			break;
		case "주임":
			System.out.println("연봉 3500");
			break;
		case "대리":
			System.out.println("연봉 4500");
			break;
		case "과장":
			System.out.println("연봉 5000");
		default:
			System.out.println("입사부터하십시오");
			break;
	}
		

	}

}
