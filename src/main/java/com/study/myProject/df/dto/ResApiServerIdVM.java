package com.study.myProject.df.dto;

import java.util.List;

import lombok.Data;

@Data
public class ResApiServerIdVM {

	private List<Row> rows;
	
	@Data
	public static class Row{
		private String serverId;
		private String serverName;
		
	}
}
