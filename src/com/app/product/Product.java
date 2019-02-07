package com.app.product;

public class Product {

	private int prdctId;
	private String prdcName;
	double prdctSal;
	public Product(int prdctId, String prdcName, double prdctSal) {
		super();
		this.prdctId = prdctId;
		this.prdcName = prdcName;
		this.prdctSal = prdctSal;
	}
	public int getPrdctId() {
		return prdctId;
	}
	public void setPrdctId(int prdctId) {
		this.prdctId = prdctId;
	}
	public String getPrdcName() {
		return prdcName;
	}
	public void setPrdcName(String prdcName) {
		this.prdcName = prdcName;
	}
	public double getPrdctSal() {
		return prdctSal;
	}
	public void setPrdctSal(double prdctSal) {
		this.prdctSal = prdctSal;
	}
	@Override
	public String toString() {
		return "Product [prdctId=" + prdctId + ", prdcName=" + prdcName
				+ ", prdctSal=" + prdctSal + "]";
	}
	
	
	
}
