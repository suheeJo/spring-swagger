package com.suhee.swagger.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="api test")
@Controller
public class ApiController {
	
	@ApiOperation(value="ApiOper value", notes="ApiOper notes")
	@RequestMapping(value="/first", method=RequestMethod.GET)
	public @ResponseBody ApiResponseModel test(@ModelAttribute ApiParamModel apiParam) throws Exception {
		return new ApiResponseModel();
	}
}
