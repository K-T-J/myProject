
package com.study.myProject.petBill.entity;
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table;
  
@Entity
@Table(name = "TB_CAT") 
public class TbCat {
	
	/**
	 * 고양이 테이블 고유번호
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAT_NO", unique = true, nullable = false) 
	private Long catNo;
	/**
	 * 병원 테이블 고유번호
	 */
	@Column(name = "HOS_NO") 
	private	Integer hosNo;
	 /**
	 * 종합검진
	 */
	@Column(name = "C_ALL_TEST", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cAllTest;
	/**
	 * 혈액검사
	 */
	@Column(name = "C_BLOOD_TEST", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cBloodTest;
	/**
	 * 초음파검사
	 */
	@Column(name = "C_ULTRASONOGRAPHY", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cUltrasonography;
	/**
	 * X-ray검사
	 */
	@Column(name = "C_XRAY", length = 50, columnDefinition =	"varchar(50) default '0'") 
	private String cXray;
	/**
	 * 알러지검사
	 */
	@Column(name = "C_ALLERGY", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cAllergy;
	/**
	 * 심장사상충키트
	 */
	@Column(name = "C_HEARTBUG_KIT", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cHeartbugKit;
	/**
	 * 기본신체검사
	 */
	@Column(name = "C_BASIC_PHYSICAL_TEST", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cBasicPhysicalTest;
	/**
	 * PCR검사
	 */
	@Column(name = "C_PCR", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cPcr;
	/**
	 * 방광결석
	 */
	@Column(name = "C_BLADDER_STONE", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cBladderStone;
	/**
	 * 요도결석
	 */
	@Column(name = "C_YODO_STONE", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String cYodoStone;
	/**
	 * 1차접종
	 */
	@Column(name = "C_1", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String c1;
	/**
	 * 2차접종
	 */
	@Column(name = "C_2", length = 50, columnDefinition = "varchar(50) default '0'") 
	private String c2;
 	/**
	 * 3차접종
	 */
 	@Column(name = "C_3", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String c3;
 	/**
	 * 심장사상충예방약
	 */
 	@Column(name = "C_CIPM", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cCipm;
 	/**
	 * 항체가검사
	 */
 	@Column(name = "C_ANTIBODY_TEST", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cAntibodyTest;
 	/**
	 * 추가접종
	 */
 	@Column(name = "C_BOOSTER_VCC", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cBoosterVcc;
 	/**
	 * 광견병접종
	 */
 	@Column(name = "C_RABIES", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cRabies;
 	/**
	 * 유선종양
	 */
 	@Column(name = "C_BREAST_TUMOR", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cBreastTumor;
 	/**
	 * 자궁축농증
	 */
 	@Column(name = "C_PYOMETRA", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cPyometra;
 	/**
	 * 기타종양
	 */
 	@Column(name = "C_ETC_TUMORS", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cEtcTumors;
 	/**
	 * 다리검진
	 */
 	@Column(name = "C_LEG_TEST", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cLegTest;
 	/**
	 * 슬개골탈구
	 */
 	@Column(name = "C_PATELLA_DISLOCATION", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cPatellaDislocation;
 	/**
	 * 대퇴골두
	 */
 	@Column(name = "C_FEMORAL_HEAD", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cFemoralHead;
 	/**
	 * 전십자인대
	 */
 	@Column(name = "C_ACL", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cAcl;
 	/**
	 * 구토
	 */
 	@Column(name = "C_THROW_UP", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cThrowUp;
 	/**
	 * 설사
	 */
 	@Column(name = "C_DIARRHEA", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cDiarrhea;
 	/**
	 * 혈변혈뇨
	 */
 	@Column(name = "C_BLOOD_POOP", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cBloodPoop;
 	/**
	 * 기본진료
	 */
 	@Column(name = "C_BASIC_CARE", length = 50, columnDefinition = "varchar(50) default '0'") 
 	private String cBasicCare;
	/**
	 * 안과진료
	 */
	 @Column(name = "C_EYE_CARE", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cEyeCare;
	/**
	 * 체리아이
	 */
	 @Column(name = "C_CHERRY_EYE", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cCherryEye;
	/**
	 * 중성화(남)
	 */
	 @Column(name = "C_TNRM", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cTnrm;
	/**
	 * 중성화(여)
	 */
	 @Column(name = "C_TNRW", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cTnrw;
	/**
	 * 스케일링
	 */
	 @Column(name = "C_SCALING", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cScaling;
	/**
	 * 전발치수술
	 */
	 @Column(name = "C_ALL_TOOTH", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cAllTooth;
	/**
	 * 유치발치
	 */
	 @Column(name = "C_MIK_TOOTH", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cMilkTooth;
	/**
	 * 치과진료
	 */
	 @Column(name = "C_DENTAL_CARE", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cDentalCare;
	/**
	 * 영구치발치
	 */
	 @Column(name = "C_FOREVER_TOOTH", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cForeverTooth;
	/**
	 * 탈장
	 */
	 @Column(name = "C_HERNIA", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cHernia;
	/**
	 * 피부진료
	 */
	 @Column(name = "C_SKIN_CARE", length = 50, columnDefinition = "varchar(50) default '0'") 
	 private String cSkinCare;
	public String getcAllTest() {
		return cAllTest;
	}
	public void setcAllTest(String cAllTest) {
		this.cAllTest = cAllTest;
	}
	public String getcBloodTest() {
		return cBloodTest;
	}
	public void setcBloodTest(String cBloodTest) {
		this.cBloodTest = cBloodTest;
	}
	public String getcUltrasonography() {
		return cUltrasonography;
	}
	public void setcUltrasonography(String cUltrasonography) {
		this.cUltrasonography = cUltrasonography;
	}
	public String getcXray() {
		return cXray;
	}
	public void setcXray(String cXray) {
		this.cXray = cXray;
	}
	public String getcAllergy() {
		return cAllergy;
	}
	public void setcAllergy(String cAllergy) {
		this.cAllergy = cAllergy;
	}
	public String getcHeartbugKit() {
		return cHeartbugKit;
	}
	public void setcHeartbugKit(String cHeartbugKit) {
		this.cHeartbugKit = cHeartbugKit;
	}
	public String getcBasicPhysicalTest() {
		return cBasicPhysicalTest;
	}
	public void setcBasicPhysicalTest(String cBasicPhysicalTest) {
		this.cBasicPhysicalTest = cBasicPhysicalTest;
	}
	public String getcPcr() {
		return cPcr;
	}
	public void setcPcr(String cPcr) {
		this.cPcr = cPcr;
	}
	public String getcBladderStone() {
		return cBladderStone;
	}
	public void setcBladderStone(String cBladderStone) {
		this.cBladderStone = cBladderStone;
	}
	public String getcYodoStone() {
		return cYodoStone;
	}
	public void setcYodoStone(String cYodoStone) {
		this.cYodoStone = cYodoStone;
	}
	public String getcCipm() {
		return cCipm;
	}
	public void setcCipm(String cCipm) {
		this.cCipm = cCipm;
	}
	public String getcAntibodyTest() {
		return cAntibodyTest;
	}
	public void setcAntibodyTest(String cAntibodyTest) {
		this.cAntibodyTest = cAntibodyTest;
	}
	public String getcBoosterVcc() {
		return cBoosterVcc;
	}
	public void setcBoosterVcc(String cBoosterVcc) {
		this.cBoosterVcc = cBoosterVcc;
	}
	public String getcRabies() {
		return cRabies;
	}
	public void setcRabies(String cRabies) {
		this.cRabies = cRabies;
	}
	public String getcBreastTumor() {
		return cBreastTumor;
	}
	public void setcBreastTumor(String cBreastTumor) {
		this.cBreastTumor = cBreastTumor;
	}
	public String getcPyometra() {
		return cPyometra;
	}
	public void setcPyometra(String cPyometra) {
		this.cPyometra = cPyometra;
	}
	public String getcEtcTumors() {
		return cEtcTumors;
	}
	public void setcEtcTumors(String cEtcTumors) {
		this.cEtcTumors = cEtcTumors;
	}
	public String getcLegTest() {
		return cLegTest;
	}
	public void setcLegTest(String cLegTest) {
		this.cLegTest = cLegTest;
	}
	public String getcPatellaDislocation() {
		return cPatellaDislocation;
	}
	public void setcPatellaDislocation(String cPatellaDislocation) {
		this.cPatellaDislocation = cPatellaDislocation;
	}
	public String getcFemoralHead() {
		return cFemoralHead;
	}
	public void setcFemoralHead(String cFemoralHead) {
		this.cFemoralHead = cFemoralHead;
	}
	public String getcAcl() {
		return cAcl;
	}
	public void setcAcl(String cAcl) {
		this.cAcl = cAcl;
	}
	public String getcThrowUp() {
		return cThrowUp;
	}
	public void setcThrowUp(String cThrowUp) {
		this.cThrowUp = cThrowUp;
	}
	public String getcDiarrhea() {
		return cDiarrhea;
	}
	public void setcDiarrhea(String cDiarrhea) {
		this.cDiarrhea = cDiarrhea;
	}
	public String getcBloodPoop() {
		return cBloodPoop;
	}
	public void setcBloodPoop(String cBloodPoop) {
		this.cBloodPoop = cBloodPoop;
	}
	public String getcBasicCare() {
		return cBasicCare;
	}
	public void setcBasicCare(String cBasicCare) {
		this.cBasicCare = cBasicCare;
	}
	public String getcEyeCare() {
		return cEyeCare;
	}
	public void setcEyeCare(String cEyeCare) {
		this.cEyeCare = cEyeCare;
	}
	public String getcCherryEye() {
		return cCherryEye;
	}
	public void setcCherryEye(String cCherryEye) {
		this.cCherryEye = cCherryEye;
	}
	public String getcTnrm() {
		return cTnrm;
	}
	public void setcTnrm(String cTnrm) {
		this.cTnrm = cTnrm;
	}
	public String getcTnrw() {
		return cTnrw;
	}
	public void setcTnrw(String cTnrw) {
		this.cTnrw = cTnrw;
	}
	public String getcScaling() {
		return cScaling;
	}
	public void setcScaling(String cScaling) {
		this.cScaling = cScaling;
	}
	public String getcAllTooth() {
		return cAllTooth;
	}
	public void setcAllTooth(String cAllTooth) {
		this.cAllTooth = cAllTooth;
	}
	public String getcMilkTooth() {
		return cMilkTooth;
	}
	public void setcMilkTooth(String cMilkTooth) {
		this.cMilkTooth = cMilkTooth;
	}
	public String getcDentalCare() {
		return cDentalCare;
	}
	public void setcDentalCare(String cDentalCare) {
		this.cDentalCare = cDentalCare;
	}
	public String getcForeverTooth() {
		return cForeverTooth;
	}
	public void setcForeverTooth(String cForeverTooth) {
		this.cForeverTooth = cForeverTooth;
	}
	public String getcHernia() {
		return cHernia;
	}
	public void setcHernia(String cHernia) {
		this.cHernia = cHernia;
	}
	public String getcSkinCare() {
		return cSkinCare;
	}
	public void setcSkinCare(String cSkinCare) {
		this.cSkinCare = cSkinCare;
	}
 
}
		  