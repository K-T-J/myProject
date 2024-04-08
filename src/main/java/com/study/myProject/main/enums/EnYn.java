package com.study.myProject.main.enums;

import lombok.Getter;

@Getter
public enum EnYn {
	
	YES	("Y","예"),		//()를 붙이면 생성자를 호출하는것이다 그래서 매개변수로 값이 들어간다.
	NO	("N","아니오")
	;
	
	private String code;
	private String desc;
	
	private EnYn(String code, String desc) { //생성자
		this.code = code;
		this.desc = desc;
	}
	
	public static EnYn search(String code) { //검색
		for(EnYn status : EnYn.values()) {
			if(code.equals(status.getCode()))
				return status;
		}
		return null;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
}
