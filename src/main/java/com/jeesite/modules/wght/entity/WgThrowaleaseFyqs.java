/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.wght.entity;

import java.util.Date;

import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.modules.bd.entity.BdProject;

/**
 * 退租管理Entity
 * @author LY
 * @version 2019-12-19
 */
@Table(name="wg_throwalease_fyqs", alias="a", columns={
		@Column(name="pk_throwalease_fyqs", attrName="pkThrowaleaseFyqs", label="主键", isPK=true),
		@Column(name="pk_throwalease", attrName="pkThrowalease.pkThrowalease", label="表头主键"),
		@Column(name="pk_costproject", attrName="pkCostproject.pkProject", label="收费项目"),
		@Column(name="nygtmny", attrName="nygtmny", label="应退金额"),
		@Column(name="dytdate", attrName="dytdate", label="应退日期"),
		@Column(name="ntaxrate", attrName="ntaxrate", label="税率"),
		@Column(name="nnotaxmny", attrName="nnotaxmny", label="无税金额"),
		@Column(name="ntaxmny", attrName="ntaxmny", label="税额"),
		@Column(name="nyjtmny", attrName="nyjtmny", label="已退金额"),
		@Column(name="nygqrmny", attrName="nygqrmny", label="扣减应确认金额"),
		@Column(name="nyjqrmny", attrName="nyjqrmny", label="扣减已确认金额"),
		@Column(name="vdef1", attrName="vdef1", label="自定义项1"),
		@Column(name="vdef2", attrName="vdef2", label="自定义项2"),
		@Column(name="vdef3", attrName="vdef3", label="自定义项3"),
		@Column(name="vdef4", attrName="vdef4", label="自定义项4"),
		@Column(name="vdef5", attrName="vdef5", label="自定义项5"),
		@Column(name="dr", attrName="dr", label="删除标识"),
		@Column(name="ts", attrName="ts", label="时间戳"),
	}, joinTable={
		@JoinTable(type=Type.LEFT_JOIN, entity=BdProject.class, attrName="pkCostproject", alias="cp1",
		on="cp1.pk_project = a.pk_costproject", columns={
			@Column(name="pk_project", label="主键", isPK=true, isQuery=false),
			@Column(name="code", label="编码", isQuery=false),
			@Column(name="name", label="名称", isQuery=false),
		}),
}, orderBy="a.pk_throwalease_fyqs ASC"
)
public class WgThrowaleaseFyqs extends DataEntity<WgThrowaleaseFyqs> {
	
	private static final long serialVersionUID = 1L;
	private String pkThrowaleaseFyqs;		// 主键
	private WgThrowalease pkThrowalease;		// 表头主键 父类
	private BdProject pkCostproject;		// 收费项目
	private Double nygtmny;		// 应退金额
	private Date dytdate;		// 应退日期
	private Integer ntaxrate;		// 税率
	private Double nnotaxmny;		// 无税金额
	private Double ntaxmny;		// 税额
	private Double nyjtmny;		// 已退金额
	private Double nygqrmny;		//扣减应确认金额
	private Double nyjqrmny;		//扣减已确认金额
	private String vdef1;		// 自定义项1
	private String vdef2;		// 自定义项2
	private String vdef3;		// 自定义项3
	private String vdef4;		// 自定义项4
	private String vdef5;		// 自定义项5
	private Integer dr;		// 删除标识
	private Date ts;		// 时间戳
	
	public WgThrowaleaseFyqs() {
		this(null);
	}

	public WgThrowaleaseFyqs(WgThrowalease pkThrowalease){
		this.pkThrowalease = pkThrowalease;
	}
	
	public String getPkThrowaleaseFyqs() {
		return pkThrowaleaseFyqs;
	}

	public void setPkThrowaleaseFyqs(String pkThrowaleaseFyqs) {
		this.pkThrowaleaseFyqs = pkThrowaleaseFyqs;
	}
	
	public WgThrowalease getPkThrowalease() {
		return pkThrowalease;
	}

	public void setPkThrowalease(WgThrowalease pkThrowalease) {
		this.pkThrowalease = pkThrowalease;
	}
	
	public BdProject getPkCostproject() {
		return pkCostproject;
	}

	public void setPkCostproject(BdProject pkCostproject) {
		this.pkCostproject = pkCostproject;
	}
	
	public Double getNygtmny() {
		return nygtmny;
	}

	public void setNygtmny(Double nygtmny) {
		this.nygtmny = nygtmny;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getDytdate() {
		return dytdate;
	}

	public void setDytdate(Date dytdate) {
		this.dytdate = dytdate;
	}
	
	public Integer getNtaxrate() {
		return ntaxrate;
	}

	public void setNtaxrate(Integer ntaxrate) {
		this.ntaxrate = ntaxrate;
	}
	
	public Double getNnotaxmny() {
		return nnotaxmny;
	}

	public void setNnotaxmny(Double nnotaxmny) {
		this.nnotaxmny = nnotaxmny;
	}
	
	public Double getNtaxmny() {
		return ntaxmny;
	}

	public void setNtaxmny(Double ntaxmny) {
		this.ntaxmny = ntaxmny;
	}
	
	public Double getNyjtmny() {
		return nyjtmny;
	}

	public void setNyjtmny(Double nyjtmny) {
		this.nyjtmny = nyjtmny;
	}
	
	public Double getNygqrmny() {
		return nygqrmny;
	}

	public void setNygqrmny(Double nygqrmny) {
		this.nygqrmny = nygqrmny;
	}

	public Double getNyjqrmny() {
		return nyjqrmny;
	}

	public void setNyjqrmny(Double nyjqrmny) {
		this.nyjqrmny = nyjqrmny;
	}

	public String getVdef1() {
		return vdef1;
	}

	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}
	
	public String getVdef2() {
		return vdef2;
	}

	public void setVdef2(String vdef2) {
		this.vdef2 = vdef2;
	}
	
	public String getVdef3() {
		return vdef3;
	}

	public void setVdef3(String vdef3) {
		this.vdef3 = vdef3;
	}
	
	public String getVdef4() {
		return vdef4;
	}

	public void setVdef4(String vdef4) {
		this.vdef4 = vdef4;
	}
	
	public String getVdef5() {
		return vdef5;
	}

	public void setVdef5(String vdef5) {
		this.vdef5 = vdef5;
	}
	
	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}
	
	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}
	
}