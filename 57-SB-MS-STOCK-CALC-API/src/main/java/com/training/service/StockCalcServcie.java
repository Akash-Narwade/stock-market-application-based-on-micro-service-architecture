package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bindings.StockCalcApiResponse;
import com.training.bindings.StockPriceApiResponse;
import com.training.client.StockPriceClient;

@Service
public class StockCalcServcie {

	@Autowired
	private StockPriceClient priceClient;

	public StockCalcApiResponse getStocksCost(String companyName, Integer quantity) {
		StockCalcApiResponse response = new StockCalcApiResponse();
		
		// Access STOCK-PRICE-API with Company Name
		StockPriceApiResponse priceApiResposne = priceClient.invokeStockPriceAPi(companyName);
		Double companyStockPrice = priceApiResposne.getCompanyStockPrice();
		
		// calculating total Stock Based on price and quantity
		Double totalCost = companyStockPrice * quantity;
		
		response.setCompanyName(companyName);
		response.setPortNumber(priceApiResposne.getPortNumber());
		response.setQuantity(quantity);
		response.setTotalCost(totalCost);
		
		return response;
	}
}
