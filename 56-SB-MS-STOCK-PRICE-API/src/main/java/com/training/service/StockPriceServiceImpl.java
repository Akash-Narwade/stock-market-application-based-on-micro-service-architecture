package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.training.bindings.StockPriceResponse;
import com.training.repository.StockPriceRepository;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepository;
	
	@Autowired
	private Environment env;
	
	@Override
	public StockPriceResponse getStockPrice(String companyName) {
		Double stockPrice = stockPriceRepository.findStockPriceByCompanyName(companyName);
		
		StockPriceResponse resposne =new StockPriceResponse();
		resposne.setCompanyName(companyName);
		resposne.setCompanyStockPrice(stockPrice);
		
		String port = env.getProperty("server.port");
		resposne.setPortNumber(Integer.parseInt(port));
		return resposne;
	}

}
