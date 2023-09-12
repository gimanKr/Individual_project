package com.kh.view;

import java.util.Scanner;

public class ActMenu {
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("\n== 환영합니다. ==");
			System.out.println("1. 요일별 연극조회");
			System.out.println("2. 시간별 연극조회");
			System.out.println("3. 예약확인");
			System.out.println("4. 예약취소");
			
			System.out.println("5. 회원 가입");
			System.out.println("6. 회원 탈퇴");
			
			System.out.print(">> 메뉴 선택 :");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
				
				break;
			case 2 : 
				break;
			case 3 : 
				mc.reserveByInfo(inputByInfo(),inputByActName());
				break;
			case 4 : 
				break;
			case 5 : 
				break;
			case 6 : 
				break;
			default : 
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요.");
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	
	
	
	}
	public String inputByInfo() {
		System.out.print("\n회원 아이디 입력 : ");
		return sc.nextLine();
		
	}
	public String inputByActName() {
		System.out.print("\n연극 이름 : ");
		return sc.nextLine();
		
	}
}
