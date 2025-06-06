package com.training.bindings;

public class StockPriceResponse {
    private String companyName;
    
    private Double companyStockPrice;
    
    private Integer portNumber;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyStockPrice() {
		return companyStockPrice;
	}

	public void setCompanyStockPrice(Double companyStockPrice) {
		this.companyStockPrice = companyStockPrice;
	}

	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}

	@Override
	public String toString() {
		return "StockPriceResponse [companyName=" + companyName + ", companyStockPrice=" + companyStockPrice
				+ ", portNumber=" + portNumber + "]";
	}
    
}
