package com.in28minutes.rest.microservices.currencyexchangeservice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.microservices.currencyexchangeservice1.Model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long>{
	
	CurrencyExchange findByFromAndTo(String from,String to);

}
