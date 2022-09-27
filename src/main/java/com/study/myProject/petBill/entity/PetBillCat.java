package com.study.myProject.petBill.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PetBillCat")
public class PetBillCat {
	/**
	 * 고양이 테이블 고유번호
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long catNo;
	/**
	 * 병원 테이블 고유번호
	 * */
	@Column(name = "HOSNO", columnDefinition = "varchar(50) default '0'")
	private Integer hosNo;
	/**
	 * 종합검진
	 * */
	@Column(name = "CALLTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cAllTest; 
	/**
	 * 혈액검사 
	 * */
	@Column(name = "CBLOODTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cBloodTest; 			
	/**
	 * 초음파검사
	 * */
	@Column(name = "CULTRASONOGRAPHY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cUltrasonography;
	/**
	 * X-ray검사
	 * */
	@Column(name = "CXRAY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cXray; 				
	/**
	 * 알러지검사 
	 * */
	@Column(name = "CALLERGY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cAllergy; 			
	/**
	 * 심장사상충키트
	 * */
	@Column(name = "CHEARTBUGKIT", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cHeartbugKit;		
	/**
	 * 기본신체검사
	 * */
	@Column(name = "CBASICPHYSICALTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cBasicPhysicalTest;	 
	/**
	 * PCR검사 
	 * */
	@Column(name = "CPCR", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cPCR;				
	/**
	 * 방광결석 
	 * */
	@Column(name = "CBLADDERSTONE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cBladderStone;		
	/**
	 * 요도결석
	 * */
	@Column(name = "CYODOSTONE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cYodoStone;			
	/**
	 * 1차접종 
	 * */
	@Column(name = "C1", length = 50, columnDefinition = "varchar(50) default '0'")
	private String c1;					
	/**
	 * 2차접종 
	 * */
	@Column(name = "C2", length = 50, columnDefinition = "varchar(50) default '0'")
	private String c2;					
	/**
	 * 3차접종 
	 * */
	@Column(name = "C3", length = 50, columnDefinition = "varchar(50) default '0'")
	private String c3;					
	/**
	 * 심장사상충예방약 
	 * */
	@Column(name = "CCIPM", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cCIPM;				
	/**
	 * 항체가검사 
	 * */
	@Column(name = "CANTIBODYTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cAntibodyTest;		
	/**
	 * 추가접종 
	 * */
	@Column(name = "CBOOSTERVCC", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cBoosterVcc;			
	/**
	 * 광견병접종 
	 * */
	@Column(name = "CRABIES", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cRabies;				
	/**
	 * 유선종양 
	 * */
	@Column(name = "CBREASTTUMOR", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cBreastTumor;		
	/**
	 * 자궁축농증 
	 * */
	@Column(name = "CALLTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String CALLTEST;			
	/**
	 * 기타종양
	 * */
	@Column(name = "CETCTUMORS", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cEtcTumors;			
	/**
	 * 다리검진
	 * */
	@Column(name = "CLEGTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cLegTest;			
	/**
	 * 슬개골탈구
	 * */
	@Column(name = "CPATELLADISLOCATION", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cPatellaDislocation;
	/**
	 * 대퇴골두
	 * */
	@Column(name = "CFEMORALHEAD", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cFemoralHead;		
	/**
	 * 전십자인대
	 * */
	@Column(name = "CACL", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cACL;				
	/**
	 * 구토
	 * */
	@Column(name = "CTHROWUP", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cThrowUp;			
	/**
	 * 설사 
	 * */
	@Column(name = "CDIARRHEA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cDiarrhea;			
	/**
	 * 혈변혈뇨
	 * */
	@Column(name = "CBLOODPOOP", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cBloodPoop;			
	/**
	 * 기본진료
	 * */
	@Column(name = "CBASICCARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cBasicCare;			
	/**
	 * 안과진료
	 * */
	@Column(name = "CEYECARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cEyeCare;			
	/**
	 * 체리아이 
	 * */
	@Column(name = "CCHERRYEYE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cCherryEye;			
	/**
	 * 중성화(남)
	 * */
	@Column(name = "CTNRM", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cTNRM;				
	/**
	 * 중성화(여)
	 * */
	@Column(name = "CTNRW", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cTNRW;				
	/**
	 * 스케일링 
	 * */
	@Column(name = "CSCALING", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cScaling;			
	/**
	 * 전발치수술 
	 * */
	@Column(name = "CALLTOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cAllTooth;			
	/**
	 * 유치발치
	 * */
	@Column(name = "CMIKTOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cMilkTooth;			
	/**
	 * 치과진료
	 * */
	@Column(name = "CDENTALCARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cDentalCare;			
	/**
	 * 영구치발치
	 * */
	@Column(name = "CFOREVERTOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cForeverTooth;		
	/**
	 * 탈장
	 * */
	@Column(name = "CHERNIA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cHernia;				
	/**
	 * 피부진료
	 * */
	@Column(name = "CSKINCARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String cSkinCare;			

}
