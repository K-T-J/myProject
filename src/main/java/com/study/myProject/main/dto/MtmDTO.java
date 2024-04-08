package com.study.myProject.main.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MtmDTO {
	
	private Integer mtmno;
	private String mtmuserid;
	private String mtmsubject;
	private String mtmcontent;
	private LocalDateTime reg;
	private String ref;

}
