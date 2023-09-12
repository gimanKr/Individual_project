package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.ActDao;
import com.kh.model.vo.Act;

public class ActController {
	
	public void reserveByInfo(String resName, String actName) {
		ArrayList<Act> act = new ActDao().reserveByInfo(resName, actName);
	}
}
