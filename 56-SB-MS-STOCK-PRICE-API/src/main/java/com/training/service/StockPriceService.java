package com.training.service;

import com.training.bindings.StockPriceResponse;

public interface StockPriceService {
	
	public StockPriceResponse getStockPrice(String companyName); 

}
