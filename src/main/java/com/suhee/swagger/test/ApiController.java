package com.suhee.swagger.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;

@Api(value="api test")
@Controller
public class ApiController {
	
	@RequestMapping(value="/first", method=RequestMethod.GET)
	public String test(@RequestParam String id) throws Exception {
		return null;
	}
}
