package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ActController;
import com.kh.model.vo.Act;

public class ActMenu {
	private Scanner sc = new Scanner(System.in);
	private ActController ac = new ActController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("\n== 환영합니다. ==");
			System.out.println("1. 연극조회");
			System.out.println("2. 연극예약");
			System.out.println("3. 예약 조회(전화번호)");
			System.out.println("4. 예약취소");
			System.out.println("5. 회원등록");
			
			
			System.out.print(">> 메뉴 선택 :");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
				ac.selectActList();
				break;
			case 2 : 
				viewResList();
				break;
			case 3 : 
				break;
			case 4 : 
				break;
			case 5 : 
				//회원등록
				makeConsumer();
				break;
			case 6 : 
				break;
			default : 
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요.");
			
			}
			
			
		}
		
		
	
	
	
	}
	public String inputByInfo() {
		System.out.print("\n회원 번호 입력 : ");
		return sc.nextLine();
		
	}
	public void viewResList() {
		ArrayList<Act> act = ac.actNameList();
		System.out.print("예약하실 연극 번호 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		for(Act a : act) {
			if(num == a.getActNo()) {
				viewRes(num);
			}
	      }
	   
		
//		for(int i = 0; i < act.size(); i++) {
//			act(i).
//		}
		
	}
	
	
	
	public void displaySuccess(String message) {
		System.out.println("\n서비스 요청 성공 : "+message);
	}
	
	public void displayFail(String message) {
		System.out.println("\n서비스 요청 실패 : "+message);
	}
	
	public void displayNoData(String message) {
		System.out.println("\n"+message);
	}
	
	public void displayActList(ArrayList<Act> act) {
		System.out.println("\n조회된 데이터는 다음과 같습니다\n");	
	   for(Act a : act) {
	         System.out.println(a);
	      }
	   }
	public void displayActNameList(ArrayList<Act> act) {
		System.out.println("\n현재 상영중인 연극 목록\n");	
	   for(Act a : act) {
	         System.out.println(a.getActNo()+ " : "+a.getActName());
	      }
	   }
	
	public void makeConsumer() {
		boolean isFalse;
		String cPhone;
		
		System.out.println("\n=== 회원등록 ===");
		System.out.print("이름 : ");
		String cName = sc.nextLine();
		
		do {
			isFalse = false;
			System.out.print("전화번호 : ");
			cPhone = sc.nextLine();
			if (cPhone != null) {
				// 일단 기존 - 전부 제거
				cPhone = cPhone.replaceAll("-", "");
	
				if (cPhone.length() == 11) {
					// 010-1234-1234
					cPhone = cPhone.substring(0, 3) + "-" + cPhone.substring(3, 7) + "-" + cPhone.substring(7);
	
				} else if (cPhone.length() == 8) {
					// 1588-1234
					cPhone = "010-"+ cPhone.substring(0, 4) + "-" + cPhone.substring(4);
				} else {
					System.out.println("형식에 맞지 않습니다. 다시입력해주세요.");
					isFalse = true;
				}
			}
		}while(isFalse);
		
		ac.makeConsumer(cName,cPhone);
	}
	
	public void viewRes(int num) {
		System.out.println("\n==== 예약 ====");
		System.out.println("1. 연극조회");
		System.out.println("2. 연극예약");
		System.out.println("3. 예약 조회(전화번호)");
		System.out.println("4. 예약취소");
		System.out.println("5. 회원등록");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
