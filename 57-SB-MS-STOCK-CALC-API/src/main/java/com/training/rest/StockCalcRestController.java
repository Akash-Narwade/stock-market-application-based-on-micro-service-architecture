package com.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.bindings.StockCalcApiResponse;
import com.training.service.StockCalcServcie;

@RestController
public class StockCalcRestController {

	@Autowired
	private StockCalcServcie calcService;
	
	@GetMapping("/calc/{companyName}/{quantity}")
	public StockCalcApiResponse getStockCost(@PathVariable String companyName, @PathVariable Integer quantity) {
		StockCalcApiResponse stockCalcApiResponse = calcService.getStocksCost(companyName, quantity);
		return stockCalcApiResponse;
	}
}
