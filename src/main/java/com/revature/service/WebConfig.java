package com.revature.service;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

	

	@Bean
	public RestTemplate restTemplate() {
		CloseableHttpClient client = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory ();
		requestFactory.setHttpClient(client);
		return new RestTemplate(requestFactory);
	}
}	
	
	
	
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
// }