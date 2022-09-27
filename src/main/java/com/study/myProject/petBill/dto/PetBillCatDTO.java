package com.study.myProject.petBill.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetBillCatDTO {
	
	private Integer hosNo;
	private String cAllTest; 			//종합검진
	private String cBloodTest; 			//혈액검사 
	private String cUltrasonography;	//초음파검사
	private String cXray; 				//X-ray검사
	private String cAllergy; 			//알러지검사 
	private String cHeartbugKit;		//심장사상충키트
	private String cBasicPhysicalTest;	//기본신체검사 
	private String cPCR;				//PCR검사 
	private String cBladderStone;		//방광결석 
	private String cYodoStone;			//요도결석
	private String c1;					//1차접종
	private String c2;					//2차접종 
	private String c3;					//3차접종 
	private String cCIPM;				//심장사상충예방약 
	private String cAntibodyTest;		//항체가검사 
	private String cBoosterVcc;			//추가접종 
	private String cRabies;				//광견병접종 
	private String cBreastTumor;		//유선종양 
	private String cPyometra;			//자궁축농증 
	private String cEtcTumors;			//기타종양
	private String cLegTest;			//다리검진
	private String cPatellaDislocation;	//슬개골탈구
	private String cFemoralHead;		//대퇴골두
	private String cACL;				//전십자인대
	private String cThrowUp;			//구토 
	private String cDiarrhea;			//설사 
	private String cBloodPoop;			//혈변혈뇨
	private String cBasicCare;			//기본진료
	private String cEyeCare;			//안과진료
	private String cCherryEye;			//체리아이 
	private String cTNRM;				//중성화(남)
	private String cTNRW;				//중성화(여)
	private String cScaling;			//스케일링 
	private String cAllTooth;			//전발치수술 
	private String cMilkTooth;			//유치발치
	private String cDentalCare;			//치과진료
	private String cForeverTooth;		//영구치발치
	private String cHernia;				//탈장
	private String cSkinCare;			//피부진료
	
}
