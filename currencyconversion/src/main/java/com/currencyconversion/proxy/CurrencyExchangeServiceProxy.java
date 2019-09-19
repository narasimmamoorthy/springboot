package com.currencyconversion.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currencyconversion.bean.CurrencyConversionBean;

@FeignClient(name="firstmicroservice")
@RibbonClient(name="firstmicroservice")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from,
			@PathVariable("to") String to);
}

