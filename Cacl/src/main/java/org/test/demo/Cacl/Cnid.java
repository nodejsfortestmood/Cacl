package org.test.demo.Cacl;

import java.io.Serializable;

public class Cnid implements Serializable {
	
	private static final long serialVersionUID = 2871964412514637319L;
	private String cidn;
	private String orderNo;
	private String api;
	private String ksi;
	private String sbc;
	private String uc;
	
	public String getCidn() {
		return cidn;
	}
	public String getKsi() {
		return ksi;
	}
	public void setKsi(String ksi) {
		this.ksi = ksi;
	}
	public String getSbc() {
		return sbc;
	}
	public void setSbc(String sbc) {
		this.sbc = sbc;
	}
	public String getUc() {
		return uc;
	}
	public void setUc(String uc) {
		this.uc = uc;
	}
	public void setCidn(String cidn) {
		this.cidn = cidn;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}

}
