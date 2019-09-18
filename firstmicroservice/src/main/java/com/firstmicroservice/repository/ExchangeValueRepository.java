package com.firstmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstmicroservice.entity.ExchangeValue;
/**
 * Repository for getting exchange rates
 * @author Narasimmamoorthy
 *
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from,String to);

}
