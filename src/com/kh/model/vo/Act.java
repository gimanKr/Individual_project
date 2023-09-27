package com.kh.model.vo;

public class Act {
	private int ActNo;
	private String ActName;
	private String ActDay;
	private int ActStartTime;
	private int ActDelayTime;
	private int MaxPerson;

	public Act() {
	};

	public Act(int actNo, String actName, String actDay, int actStartTime, int actDelayTime, int maxPerson) {
		super();
		ActNo = actNo;
		ActName = actName;
		ActDay = actDay;
		ActStartTime = actStartTime;
		ActDelayTime = actDelayTime;
		MaxPerson = maxPerson;
	}

	public int getActNo() {
		return ActNo;
	}

	public void setActNo(int actNo) {
		ActNo = actNo;
	}

	public String getActName() {
		return ActName;
	}

	public void setActName(String actName) {
		ActName = actName;
	}

	public String getActDay() {
		return ActDay;
	}

	public void setActDay(String actDay) {
		ActDay = actDay;
	}

	public int getActStartTime() {
		return ActStartTime;
	}

	public void setActStartTime(int actStartTime) {
		ActStartTime = actStartTime;
	}


	public int getActDelayTime() {
		return ActDelayTime;
	}

	public void setActDelayTime(int actDelayTime) {
		ActDelayTime = actDelayTime;
	}

	public int getMaxPerson() {
		return MaxPerson;
	}

	public void setMaxPerson(int maxPerson) {
		MaxPerson = maxPerson;
	}
	
	@Override
	public String toString() {
		return "[ " + ActName + " ]\n연극일 : " + ActDay +", 연극 시작 : " + ActStartTime
				+ ", 소요시간 : " + ActDelayTime + ", 정원 : " + MaxPerson;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
