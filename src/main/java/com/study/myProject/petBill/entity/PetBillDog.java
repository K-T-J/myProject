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
@Table(name = "PetBillDog")
public class PetBillDog {
	/**
	 * 강아지 테이블 고유번호
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hosNo;
	/**
	 * 종합검진
	 * */
	@Column(name = "DALLTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAllTest;
	/**
	 * 혈액검사
	 * */
	@Column(name = "DBLOODTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBloodTest;
	/**
	 * 초음파검사
	 * */
	@Column(name = "BULTRASONICWAVE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dUltrasonicWave;
	/**
	 * X-ray검사
	 * */
	@Column(name = "DXRAY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dXray;
	/**
	 * 알러지검사
	 * */
	@Column(name = "DALLERGY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAllergy;
	/**
	 * 심장사상충키트
	 * */
	@Column(name = "DHEARTBUGKIT", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dHeartbugKit;
	/**
	 * 기본신체검사
	 * */
	@Column(name = "DBASICPHYSICALTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBasicPhysicalTest;
	/**
	 * 1차접종
	 * */
	@Column(name = "D1", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d1;
	/**
	 * 2차접종
	 * */
	@Column(name = "D2", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d2;
	/**
	 * 3차접종
	 * */
	@Column(name = "D3", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d3;
	/**
	 * 4차접종
	 * */
	@Column(name = "D4", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d4;
	/**
	 * 5차접종
	 * */
	@Column(name = "D5", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d5;
	/**
	 * 6차접종
	 * */
	@Column(name = "D6", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d6;
	/**
	 * 심장사상충 예방약
	 * */
	@Column(name = "DCIPM", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dCIPM;
	/**
	 * 항체가검사
	 * */
	@Column(name = "DANTIBODYTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAntibodyTest;
	/**
	 * 추가접종
	 * */
	@Column(name = "DBOOSTERVCC", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBoosterVcc;
	/**
	 * 방광결석
	 * */
	@Column(name = "DBLADDERSTONE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBladderStone;
	/**
	 * 요도결석
	 * */
	@Column(name = "DYODOSTONE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dYodoStone;
	/**
	 * 유선종양
	 * */
	@Column(name = "DBREASTTUMOR", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBreastTumor;
	/**
	 * 자국축농증
	 * */
	@Column(name = "DPYOMETRA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dPyometra;
	/**
	 * 기타종양
	 * */
	@Column(name = "DETCTUMORS", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dEtcTumors;
	/**
	 * 다리검진
	 * */
	@Column(name = "DLEGTEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dLegTest;
	/**
	 * 슬개골탈구
	 * */
	@Column(name = "DPATELLADISLOCATION", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dPatellaDislocation;
	/**
	 * 대퇴골두
	 * */
	@Column(name = "DFEMORALHEAD", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dFemoralHead;
	/**
	 * 전십자인대
	 * */
	@Column(name = "DACL", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dACL;
	/**
	 * 구토
	 * */
	@Column(name = "DTHROWUP", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dThrowUp;
	/**
	 * 설사
	 * */
	@Column(name = "DDIARRHEA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dDiarrhea;
	/**
	 * 혈변/혈뇨
	 * */
	@Column(name = "DBLOODPOOP", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBloodPoop;
	/**
	 * 기본진료
	 * */
	@Column(name = "DBASICCARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBasicCare;
	/**
	 * 안과진료
	 * */
	@Column(name = "DEYECARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dEyeCare;
	/**
	 * 체리아이
	 * */
	@Column(name = "DCHERRYEYE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dCherryEye;
	/**
	 * 중성화수술(남아)
	 * */
	@Column(name = "DTNRM", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dTNRM;
	/**
	 * 중성화수술(여아)
	 * */
	@Column(name = "DTNRW", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dTNRW;
	/**
	 * 스케일링
	 * */
	@Column(name = "DSCALING", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dScaling;
	/**
	 * 전발치수술
	 * */
	@Column(name = "DALLTOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAllTooth;
	/**
	 * 유치발치
	 * */
	@Column(name = "DMILKTOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dMilkTooth;
	/**
	 * 치과진료
	 * */
	@Column(name = "DDENTALCARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dDentalCare;
	/**
	 * 영구치발치
	 * */
	@Column(name = "DFOREVERTOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dForeverTooth;
	/**
	 * 탈장
	 * */
	@Column(name = "DHERNIA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dHernia;
	/**
	 * 피부진료
	 * */
	@Column(name = "DSKINCARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dSkinCare;
}
