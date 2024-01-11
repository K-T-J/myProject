package com.study.myProject.df.dto;

import java.util.List;

import lombok.Data;
@Data
public class ResApiCharacterInfoVM {
	
	private List<Row> rows;
	
	@Data	
	public static class Row{
		public String serverId;		//서버 고유 코드
		public String characterId;	//캐릭터 고유 코드
		public String characterName;//캐릭터 명칭
		public String level;		//캐릭터 레벨
		public String jobId;		//캐릭터 직업 고유 코드
		public String jobGrowId;	//캐릭터 전직 직업 고유 코드
		public String jobName;		//캐릭터 직업 명칭
		public Integer fame;		//캐릭터 모험가 명성
		
	}

}
