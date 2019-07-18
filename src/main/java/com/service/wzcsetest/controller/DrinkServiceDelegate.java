package com.service.wzcsetest.controller;

import org.springframework.stereotype.Component;

@Component
public class DrinkServiceDelegate {

	public String drink(String drinks) {

		return "I drinkd " + drinks;
	}
}
