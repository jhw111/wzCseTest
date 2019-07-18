package com.service.wzcsetest.controller;

import javax.ws.rs.core.MediaType;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-07-18T08:46:03.524+08:00")

@RestSchema(schemaId = "wzcsetest")
@RequestMapping(path = "/wzCseTest", produces = MediaType.APPLICATION_JSON)
public class WzCseTestImpl {

	@Autowired
	private WzCseTestDelegate userWzCseTestDelegate;

	@RequestMapping(value = "/helloworld", produces = { "application/json" }, method = RequestMethod.GET)
	public String helloworld(@RequestParam(value = "name", required = true) String name) {

		return userWzCseTestDelegate.helloworld(name);
	}

}
