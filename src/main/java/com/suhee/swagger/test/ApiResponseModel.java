package com.suhee.swagger.test;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description="discription", value="value")
public class ApiResponseModel {
	private String success;
}
