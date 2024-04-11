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
@Table(name = "TB_DOG")
public class TbDog {
	
	/**
	 * 강아지 테이블 고유번호
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DOG_NO", unique = true, nullable = false)
	private Long dogNo;
	/**
	 * 병원 테이블 고유번호
	 */
	@Column(name = "HOS_NO")
	private Integer hosNo;
	/**
	 * 종합검진
	 * */
	@Column(name = "D_ALL_TEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAllTest;
	/**
	 * 혈액검사
	 * */
	@Column(name = "D_BLOOD_TEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBloodTest;
	/**
	 * 초음파검사
	 * */
	@Column(name = "D_ULTRASONOGRAPHY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dUltrasonography;
	/**
	 * X-ray검사
	 * */
	@Column(name = "D_XRAY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dXray;
	/**
	 * 알러지검사
	 * */
	@Column(name = "D_ALLERGY", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAllergy;
	/**
	 * 심장사상충키트
	 * */
	@Column(name = "DHEARTBUG_KIT", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dHeartbugKit;
	/**
	 * 기본신체검사
	 * */
	@Column(name = "D_BASIC_PHYSICAL_TEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBasicPhysicalTest;
	/**
	 * 1차접종
	 * */
	@Column(name = "D_1", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d1;
	/**
	 * 2차접종
	 * */
	@Column(name = "D_2", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d2;
	/**
	 * 3차접종
	 * */
	@Column(name = "D_3", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d3;
	/**
	 * 4차접종
	 * */
	@Column(name = "D_4", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d4;
	/**
	 * 5차접종
	 * */
	@Column(name = "D_5", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d5;
	/**
	 * 6차접종
	 * */
	@Column(name = "D_6", length = 50, columnDefinition = "varchar(50) default '0'")
	private String d6;
	/**
	 * 심장사상충 예방약
	 * */
	@Column(name = "D_CIPM", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dCipm;
	/**
	 * 항체가검사
	 * */
	@Column(name = "D_ANTIBODY_TEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAntibodyTest;
	/**
	 * 추가접종
	 * */
	@Column(name = "D_BOOST_ERVCC", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBoosterVcc;
	/**
	 * 방광결석
	 * */
	@Column(name = "D_BLADDER_STONE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBladderStone;
	/**
	 * 요도결석
	 * */
	@Column(name = "D_YODO_STONE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dYodoStone;
	/**
	 * 유선종양
	 * */
	@Column(name = "D_BREAST_TUMOR", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBreastTumor;
	/**
	 * 자국축농증
	 * */
	@Column(name = "D_PYOMETRA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dPyometra;
	/**
	 * 기타종양
	 * */
	@Column(name = "D_ETC_TUMORS", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dEtcTumors;
	/**
	 * 다리검진
	 * */
	@Column(name = "D_LEG_TEST", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dLegTest;
	/**
	 * 슬개골탈구
	 * */
	@Column(name = "D_PATELLA_DISLOCATION", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dPatellaDislocation;
	/**
	 * 대퇴골두
	 * */
	@Column(name = "D_FEMORAL_HEAD", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dFemoralHead;
	/**
	 * 전십자인대
	 * */
	@Column(name = "D_ACL", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAcl;
	/**
	 * 구토
	 * */
	@Column(name = "D_THROW_UP", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dThrowUp;
	/**
	 * 설사
	 * */
	@Column(name = "D_DIARRHEA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dDiarrhea;
	/**
	 * 혈변/혈뇨
	 * */
	@Column(name = "D_BLOOD_POOP", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBloodPoop;
	/**
	 * 기본진료
	 * */
	@Column(name = "D_BASIC_CARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dBasicCare;
	/**
	 * 안과진료
	 * */
	@Column(name = "D_EYE_CARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dEyeCare;
	/**
	 * 체리아이
	 * */
	@Column(name = "D_CHERRY_EYE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dCherryEye;
	/**
	 * 중성화수술(남아)
	 * */
	@Column(name = "D_TNRM", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dTnrm;
	/**
	 * 중성화수술(여아)
	 * */
	@Column(name = "D_TNRW", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dTnrw;
	/**
	 * 스케일링
	 * */
	@Column(name = "D_SCALING", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dScaling;
	/**
	 * 전발치수술
	 * */
	@Column(name = "D_ALL_TOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dAllTooth;
	/**
	 * 유치발치
	 * */
	@Column(name = "D_MILK_TOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dMilkTooth;
	/**
	 * 치과진료
	 * */
	@Column(name = "D_DENTAL_CARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dDentalCare;
	/**
	 * 영구치발치
	 * */
	@Column(name = "D_FOREVER_TOOTH", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dForeverTooth;
	/**
	 * 탈장
	 * */
	@Column(name = "D_HERNIA", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dHernia;
	/**
	 * 피부진료
	 * */
	@Column(name = "D_SKIN_CARE", length = 50, columnDefinition = "varchar(50) default '0'")
	private String dSkinCare;
	
	public Long getDogNo() {
		return dogNo;
	}
	public void setDogNo(Long dogNo) {
		this.dogNo = dogNo;
	}
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
	public String getdUltrasonography() {
		return dUltrasonography;
	}
	public void setdUltrasonography(String dUltrasonography) {
		this.dUltrasonography = dUltrasonography;
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
	public String getdCipm() {
		return dCipm;
	}
	public void setdCipm(String dCipm) {
		this.dCipm = dCipm;
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
	public String getdAcl() {
		return dAcl;
	}
	public void setdAcl(String dAcl) {
		this.dAcl = dAcl;
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
	public String getdTnrm() {
		return dTnrm;
	}
	public void setdTnrm(String dTnrm) {
		this.dTnrm = dTnrm;
	}
	public String getdTnrw() {
		return dTnrw;
	}
	public void setdTnrw(String dTnrw) {
		this.dTnrw = dTnrw;
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
