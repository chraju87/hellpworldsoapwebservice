package com.soap.ws.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soap.ws.HelloWS;

@Configuration
public class WebServiceConfig {
	
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		Endpoint endpointImpl = new EndpointImpl(bus, new HelloWS());
		endpointImpl.publish("/hello");
		return endpointImpl;
		
	}

}
