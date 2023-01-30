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
	public Integer getHosNo() {
		return hosNo;
	}
	public void setHosNo(Integer hosNo) {
		this.hosNo = hosNo;
	}
	public String getdAllTest() {
		return dAllTest;
	}
	public void setdAllTest(String dAllTest) {
		this.dAllTest = dAllTest;
	}
	public String getdBloodTest() {
		return dBloodTest;
	}
	public void setdBloodTest(String dBloodTest) {
		this.dBloodTest = dBloodTest;
	}
	public String getdUltrasonicWave() {
		return dUltrasonicWave;
	}
	public void setdUltrasonicWave(String dUltrasonicWave) {
		this.dUltrasonicWave = dUltrasonicWave;
	}
	public String getdXray() {
		return dXray;
	}
	public void setdXray(String dXray) {
		this.dXray = dXray;
	}
	public String getdAllergy() {
		return dAllergy;
	}
	public void setdAllergy(String dAllergy) {
		this.dAllergy = dAllergy;
	}
	public String getdHeartbugKit() {
		return dHeartbugKit;
	}
	public void setdHeartbugKit(String dHeartbugKit) {
		this.dHeartbugKit = dHeartbugKit;
	}
	public String getdBasicPhysicalTest() {
		return dBasicPhysicalTest;
	}
	public void setdBasicPhysicalTest(String dBasicPhysicalTest) {
		this.dBasicPhysicalTest = dBasicPhysicalTest;
	}
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public String getD3() {
		return d3;
	}
	public void setD3(String d3) {
		this.d3 = d3;
	}
	public String getD4() {
		return d4;
	}
	public void setD4(String d4) {
		this.d4 = d4;
	}
	public String getD5() {
		return d5;
	}
	public void setD5(String d5) {
		this.d5 = d5;
	}
	public String getD6() {
		return d6;
	}
	public void setD6(String d6) {
		this.d6 = d6;
	}
	public String getdCIPM() {
		return dCIPM;
	}
	public void setdCIPM(String dCIPM) {
		this.dCIPM = dCIPM;
	}
	public String getdAntibodyTest() {
		return dAntibodyTest;
	}
	public void setdAntibodyTest(String dAntibodyTest) {
		this.dAntibodyTest = dAntibodyTest;
	}
	public String getdBoosterVcc() {
		return dBoosterVcc;
	}
	public void setdBoosterVcc(String dBoosterVcc) {
		this.dBoosterVcc = dBoosterVcc;
	}
	public String getdBladderStone() {
		return dBladderStone;
	}
	public void setdBladderStone(String dBladderStone) {
		this.dBladderStone = dBladderStone;
	}
	public String getdYodoStone() {
		return dYodoStone;
	}
	public void setdYodoStone(String dYodoStone) {
		this.dYodoStone = dYodoStone;
	}
	public String getdBreastTumor() {
		return dBreastTumor;
	}
	public void setdBreastTumor(String dBreastTumor) {
		this.dBreastTumor = dBreastTumor;
	}
	public String getdPyometra() {
		return dPyometra;
	}
	public void setdPyometra(String dPyometra) {
		this.dPyometra = dPyometra;
	}
	public String getdEtcTumors() {
		return dEtcTumors;
	}
	public void setdEtcTumors(String dEtcTumors) {
		this.dEtcTumors = dEtcTumors;
	}
	public String getdLegTest() {
		return dLegTest;
	}
	public void setdLegTest(String dLegTest) {
		this.dLegTest = dLegTest;
	}
	public String getdPatellaDislocation() {
		return dPatellaDislocation;
	}
	public void setdPatellaDislocation(String dPatellaDislocation) {
		this.dPatellaDislocation = dPatellaDislocation;
	}
	public String getdFemoralHead() {
		return dFemoralHead;
	}
	public void setdFemoralHead(String dFemoralHead) {
		this.dFemoralHead = dFemoralHead;
	}
	public String getdACL() {
		return dACL;
	}
	public void setdACL(String dACL) {
		this.dACL = dACL;
	}
	public String getdThrowUp() {
		return dThrowUp;
	}
	public void setdThrowUp(String dThrowUp) {
		this.dThrowUp = dThrowUp;
	}
	public String getdDiarrhea() {
		return dDiarrhea;
	}
	public void setdDiarrhea(String dDiarrhea) {
		this.dDiarrhea = dDiarrhea;
	}
	public String getdBloodPoop() {
		return dBloodPoop;
	}
	public void setdBloodPoop(String dBloodPoop) {
		this.dBloodPoop = dBloodPoop;
	}
	public String getdBasicCare() {
		return dBasicCare;
	}
	public void setdBasicCare(String dBasicCare) {
		this.dBasicCare = dBasicCare;
	}
	public String getdEyeCare() {
		return dEyeCare;
	}
	public void setdEyeCare(String dEyeCare) {
		this.dEyeCare = dEyeCare;
	}
	public String getdCherryEye() {
		return dCherryEye;
	}
	public void setdCherryEye(String dCherryEye) {
		this.dCherryEye = dCherryEye;
	}
	public String getdTNRM() {
		return dTNRM;
	}
	public void setdTNRM(String dTNRM) {
		this.dTNRM = dTNRM;
	}
	public String getdTNRW() {
		return dTNRW;
	}
	public void setdTNRW(String dTNRW) {
		this.dTNRW = dTNRW;
	}
	public String getdScaling() {
		return dScaling;
	}
	public void setdScaling(String dScaling) {
		this.dScaling = dScaling;
	}
	public String getdAllTooth() {
		return dAllTooth;
	}
	public void setdAllTooth(String dAllTooth) {
		this.dAllTooth = dAllTooth;
	}
	public String getdMilkTooth() {
		return dMilkTooth;
	}
	public void setdMilkTooth(String dMilkTooth) {
		this.dMilkTooth = dMilkTooth;
	}
	public String getdDentalCare() {
		return dDentalCare;
	}
	public void setdDentalCare(String dDentalCare) {
		this.dDentalCare = dDentalCare;
	}
	public String getdForeverTooth() {
		return dForeverTooth;
	}
	public void setdForeverTooth(String dForeverTooth) {
		this.dForeverTooth = dForeverTooth;
	}
	public String getdHernia() {
		return dHernia;
	}
	public void setdHernia(String dHernia) {
		this.dHernia = dHernia;
	}
	public String getdSkinCare() {
		return dSkinCare;
	}
	public void setdSkinCare(String dSkinCare) {
		this.dSkinCare = dSkinCare;
	}
	
	
}
