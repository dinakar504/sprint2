package com.cap.demo.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RAWMATERIALSPECS")
public class RawMaterialSpecs {
public int getRmsid() {
		return rmsid;
	}
	public void setRmsid(int rmsid) {
		this.rmsid = rmsid;
	}
	public String getRmname() {
		return rmname;
	}
	public void setRmname(String rmname) {
		this.rmname = rmname;
	}
	public int getPrice_p_u() {
		return price_p_u;
	}
	public void setPrice_p_u(int price_p_u) {
		this.price_p_u = price_p_u;
	}
	public Date getExpirydat() {
		return expirydat;
	}
	public void setExpirydat(Date expirydat) {
		this.expirydat = expirydat;
	}
	public Date getManudate() {
		return manudate;
	}
	public void setManudate(Date manudate) {
		this.manudate = manudate;
	}
	@Id
private int rmsid;
private String rmname;
private int price_p_u;
private Date expirydat;
private Date manudate;
}
