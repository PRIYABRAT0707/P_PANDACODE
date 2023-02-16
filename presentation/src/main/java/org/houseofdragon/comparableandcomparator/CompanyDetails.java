package org.houseofdragon.comparableandcomparator;

public class CompanyDetails {
	
	private int cid;
	private String companyName;
	private String countryOfOrigin;
	private double marketCapInCrore;
	private int profitInCrore;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public double getMarketCapInCrore() {
		return marketCapInCrore;
	}
	public void setMarketCapInCrore(double marketCapInCrore) {
		this.marketCapInCrore = marketCapInCrore;
	}
	public int getProfitInCrore() {
		return profitInCrore;
	}
	public void setProfitInCrore(int profitInCrore) {
		this.profitInCrore = profitInCrore;
	}
	@Override
	public String toString() {
		return "CompanyDetails [cid=" + cid + ", companyName=" + companyName + ", countryOfOrigin=" + countryOfOrigin
				+ ", marketCapInCrore=" + marketCapInCrore + ", profitInCrore=" + profitInCrore + "]";
	}
	public CompanyDetails(int cid, String companyName, String countryOfOrigin, double marketCapInCrore,
			int profitInCrore) {
		super();
		this.cid = cid;
		this.companyName = companyName;
		this.countryOfOrigin = countryOfOrigin;
		this.marketCapInCrore = marketCapInCrore;
		this.profitInCrore = profitInCrore;
	}
	
	
	
	

}
