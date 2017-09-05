package com.konantech.spring.service;

import _1._0._0._127.konan_web_service.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CamsEndpoint {
	private static final String NAMESPACE_URI = "http://127.0.0.1/konan-web-service";

	private static Logger log = LoggerFactory.getLogger(CamsEndpoint.class);

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "cams_exRequest")
	@ResponsePayload
	public CamsExResponse cams_exRequest(@RequestPayload CamsExRequest request) {
		CamsExResponse response = new CamsExResponse();
		Camsex camsex = new Camsex();
		camsex.setCapital1("1");
		camsex.setCapital2("1");
		camsex.setRequestxml("1");
		camsex.setSessionid("4");
		response.setCamsex(camsex);

		log.debug(ReflectionToStringBuilder.toString(request, ToStringStyle.MULTI_LINE_STYLE));
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "cams_testRequest")
	@ResponsePayload
	public CamsTestResponse cams_exRequest(@RequestPayload CamsTestRequest request) {
		CamsTestResponse response = new CamsTestResponse();
		response.setCapital1("1");
		response.setCapital2("1");
		response.setRequestxml("1");
		response.setSessionid("4");

		log.debug(ReflectionToStringBuilder.toString(request, ToStringStyle.MULTI_LINE_STYLE));
		return response;
	}


}
