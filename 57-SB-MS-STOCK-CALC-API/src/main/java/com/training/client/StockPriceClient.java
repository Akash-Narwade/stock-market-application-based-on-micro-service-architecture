package com.training.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.bindings.StockPriceApiResponse;


/**
 * To Invoke Stock Price Api Using feign Client using company Name Parameter.
 * 
 * @author akash.narwade
 *
 */
@FeignClient(name = "STOCK-PRICE-API" )
public interface StockPriceClient {

	@GetMapping("/price/{companyName}")
	public StockPriceApiResponse invokeStockPriceAPi(@PathVariable String companyName);
}
