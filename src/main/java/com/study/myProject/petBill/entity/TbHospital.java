package com.study.myProject.petBill.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_HOSPITAL") 
public class TbHospital {
	/**
	 * 병원 고유 번호
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HOS_NO", unique = true, nullable = false) 
	private Long hosNo;
	/**
	 * 전화번호
	 */
	@Column(name = "HOS_NUM", length = 100) 
	private String hosNum;
	/**
	 * 지역(서울/경기도)
	 */
	@Column(name = "HOS_SI", length = 50, nullable = false)
	private String hosSi;
	/**
	 * 지역구(광명시/관악구)
	 */
	@Column(name = "HOS_GU", length = 50, nullable = false)
	private String hosGu;
	/**
	 * 병원명
	 */
	@Column(name = "HOS_NAME", length = 50, nullable = false)
	private String hosName;
	/**
	 * 도로명 주소
	 */
	@Column(name = "HOS_NEW_ADDRESS", length = 200, nullable = false)
	private String hosNewAddress;
	/**
	 * x좌표
	 */
	@Column(name = "HOS_X", length = 200, nullable = false)
	private String hosX;
	/**
	 * y좌표
	 */
	@Column(name = "HOS_Y", length = 200, nullable = false)
	private String hosY;
	
	public Long getHosNo() {
		return hosNo;
	}
	public void setHosNo(Long hosNo) {
		this.hosNo = hosNo;
	}
	public String getHosNum() {
		return hosNum;
	}
	public void setHosNum(String hosNum) {
		this.hosNum = hosNum;
	}
	public String getHosSi() {
		return hosSi;
	}
	public void setHosSi(String hosSi) {
		this.hosSi = hosSi;
	}
	public String getHosGu() {
		return hosGu;
	}
	public void setHosGu(String hosGu) {
		this.hosGu = hosGu;
	}
	public String getHosName() {
		return hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
	public String getHosNewAddress() {
		return hosNewAddress;
	}
	public void setHosNewAddress(String hosNewAddress) {
		this.hosNewAddress = hosNewAddress;
	}
	public String getHosX() {
		return hosX;
	}
	public void setHosX(String hosX) {
		this.hosX = hosX;
	}
	public String getHosY() {
		return hosY;
	}
	public void setHosY(String hosY) {
		this.hosY = hosY;
	}
	
	
}
