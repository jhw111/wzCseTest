package com.service.wzcsetest.controller;

import javax.ws.rs.core.MediaType;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-07-18T08:46:03.524+08:00")

@RestSchema(schemaId = "drinkService")
@RequestMapping(path = "/drinkService", produces = MediaType.APPLICATION_JSON)
public class DrinkServiceImpl {

	@Autowired
	private DrinkServiceDelegate drinkServiceDelegate;

	// http://localhost:8080/drinkService/drink?drinks=可乐
	@RequestMapping(value = "/drink", produces = { "application/json" }, method = RequestMethod.GET)
	public String helloworld(@RequestParam(value = "drinks", required = true) String drinks) {

		return drinkServiceDelegate.drink(drinks);
	}

}
