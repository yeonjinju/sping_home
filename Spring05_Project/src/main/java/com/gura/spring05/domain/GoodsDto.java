package com.gura.spring05.domain;

import java.sql.Date;

public class GoodsDto {
/*
 * --  상품 테이블
CREATE TABLE tbl_goods (
    gdsNum       NUMBER          not null,
    gdsName      VARCHAR2(50)    not null,
    cateCode     VARCHAR2(30)    not null,
    gdsPrice     NUMBER          not null,
    gdsStock     NUMBER          null,
    gdsDes       VARCHAR2(500)    null,
    gdsImg       VARCHAR2(200)    null,
    gdsDate      DATE            default sysdate,
    primary key(gdsNum)  
);
-- 상품 테이블의 상품번호의 자동입력을 위한 시퀀스 
CREATE SEQUENCE tbl_goods_seq;
 */
	
	private String gdsName;
	private String cateCode;
	private int gdsPrice;
	private int gdsStock;
	private String gdsDes;
	private String gdsImg;
	private Date gdsDate;
	
	public GoodsDto() {}
	
	public GoodsDto(String gdsName, String cateCode, int gdsPrice, int gdsStock, String gdsDes, String gdsImg,
			Date gdsDate, int gdsNum) {
		super();
		this.gdsName = gdsName;
		this.cateCode = cateCode;
		this.gdsPrice = gdsPrice;
		this.gdsStock = gdsStock;
		this.gdsDes = gdsDes;
		this.gdsImg = gdsImg;
		this.gdsDate = gdsDate;
		this.gdsNum = gdsNum;
	}

	
	private int gdsNum;
	public int getGdsNum() {
		return gdsNum;
	}
	public void setGdsNum(int gdsNum) {
		this.gdsNum = gdsNum;
	}
	public String getGdsName() {
		return gdsName;
	}
	public void setGdsName(String gdsName) {
		this.gdsName = gdsName;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public int getGdsPrice() {
		return gdsPrice;
	}
	public void setGdsPrice(int gdsPrice) {
		this.gdsPrice = gdsPrice;
	}
	public int getGdsStock() {
		return gdsStock;
	}
	public void setGdsStock(int gdsStock) {
		this.gdsStock = gdsStock;
	}
	public String getGdsDes() {
		return gdsDes;
	}
	public void setGdsDes(String gdsDes) {
		this.gdsDes = gdsDes;
	}
	public String getGdsImg() {
		return gdsImg;
	}
	public void setGdsImg(String gdsImg) {
		this.gdsImg = gdsImg;
	}
	public Date getGdsDate() {
		return gdsDate;
	}
	public void setGdsDate(Date gdsDate) {
		this.gdsDate = gdsDate;
	}


	
	
}
