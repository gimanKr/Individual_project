package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.ActDao;
import com.kh.model.service.ActService;
import com.kh.model.vo.Act;
import com.kh.view.ActMenu;

public class ActController {
	
	public void selectActList() {
		ArrayList<Act> act = new ActService().selectActList();
		
		if(act.isEmpty()) { 
			new ActMenu().displayNoData("전체 조회 결과가 없습니다.");
			
		}else { 
			new ActMenu().displayActList(act);
		}
		
	}
	
	public ArrayList<Act> actNameList() {
		ArrayList<Act> act = new ActService().actNameList();
		
		if(act.isEmpty()) { 
			new ActMenu().displayNoData("전체 조회 결과가 없습니다.");
			
		}else { 
			new ActMenu().displayActNameList(act);
		}
		return act;
	}
	
	public void makeConsumer(String cName,String cPhone) {
		int result = new ActService().makeConsumer(cName, cPhone);
		
		if(result > 0) {
			new ActMenu().displaySuccess("성공적으로 회원 추가를 완료하였습니다.");
		}else {
			new ActMenu().displayFail("회원 추가에 실패하였습니다.");
		}
	}
}
