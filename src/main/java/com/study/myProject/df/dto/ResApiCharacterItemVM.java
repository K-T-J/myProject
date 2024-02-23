package com.study.myProject.df.dto;

import java.util.List;
import lombok.Data;

@Data
public class ResApiCharacterItemVM {
	  private String characterId;				//캐릭터 고유 코드			
	  private String characterName;				//캐릭터 명
	  private String level;						//캐릭터 레벨
	  private String jobId;						//캐릭터 직업 고유 코드
	  private String jobGrowId;					//캐릭터 전직 직업 고유 코드
	  private String jobName;					//캐릭터 직업 명칭
	  private String jobGrowName;				//캐릭터 전직 직업 명칭
	  private String adventureName;				//모험단명
	  private String guildId;					//길드 고유 코드
	  private String guildName;					//길드명
	  private List<Equipment> equipment;		//장비
	  
	  //장비
	  @Data
	  public static class Equipment{
		  private String slotId;				//아이템 슬롯 고유 코드
		  private String slotName;				//아이템 슬롯명
		  private String itemId;				//아이템 고유 코드
		  private String itemName;				//아이템 명칭
		  private String itemTypeId;			//아이템 타입 고유 코드
		  private String itemType;				//아이템 타입
		  private String itemTypeDetailId;		//아이템 세부 타입 고유 코드
		  private String itemTypeDetail;		//아이템 세부 타입
		  private String itemAvailableLevel;	//아이템 장착 가능 레벨
		  private String itemRarity;			//아이템 희귀도 등급 (에픽/레전/레어...)
		  private String setItemId;				//세트 아이템 고유 코드
		  private String setItemName;			//세트 아이템 명칭
		  private Skin skin;					//무기 스킨
		  private String reinforce;				//아이템 강화 or 증폭 or 개조 수치
		  private String itemGradeName;			//아이템 등급명
		  private Enchant enchant;				//마법(보주) 부여
		  private String amplificationName;		//아이템 증폭 능력치 속성 ( 예 : 차원의 힘 )
		  private String refine;				//아이템 재련 수치
		  private BakalInfo bakalInfo;			//바칼 융합 옵션 정보
		  private UpgradeInfo upgradeInfo;		//업그레이드 아이템 정보
		  private FixedOption fixedOption;		//고정 옵션 정보
		  private List<SetItemInfo> setItemInfo;//세트 아이템 구성 정보
	  }
	  //무기 스킨
	  @Data
	  public static class Skin{
		  private String itemId;				//아이템 고유 코드
		  private String itemName;				//아이템 명칭
		  private String itemRarity;			//아이템 희귀도 등급
	  }
	  //마법(보주) 부여
	  @Data
	  public static class Enchant{
		  private List<Status> status;
	  }
	  //마법(보주) 부여 정보
	  @Data
	  public static class Status{
		  private String name;					
		  private String value;
	  }
	  //바칼 융합 옵션 정보
	  @Data
	  public static class BakalInfo{
		  private List<Options> options;
	  }
	  //바칼 융합 옵션
	  @Data
	  public static class Options{
		  private String buff;					//버프력
		  private String explain;				//설명
		  private String explainDetail;			//상세설명
	  }
	  ////업그레이드 아이템 정보
	  @Data
	  public static class UpgradeInfo{
		  private String itemId;				//아이템 고유 코드
		  private String itemName;				//아이템 명칭
	  }
	  //고정 옵션 정보
	  @Data
	  public static class FixedOption{
          private String damage;				//피해 증가
          private String buff;					//버프력
          private String level;					//장비레벨
          private String exp;					//장비 경험치
          private String explain;				//설명
          private String explainDetail;		  	//상세 설명
	  }
	  //세트 아이템 구성 정보
	  @Data
	  public static class SetItemInfo{
		  private String setItemId;				//세트 아이템 고유 코드
		  private String setItemName;			//세트 아이템 명칭
		  private List<SlotInfo> slotInfo;		//슬롯 정보
		  private String activeSetNo;			//세트 개수
	  }
	  //슬롯 정보
	  @Data
	  public static class SlotInfo{
		  private String slotId;				//아이템 슬롯 고유 코드
		  private String slotName;				//아이템 장착부위 명칭
		  private String itemRarity;			//아이템 희귀도 등급 (에픽/레전/레어...)
	  }
}
