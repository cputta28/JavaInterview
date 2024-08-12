package com.chinnu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieCatalougeService2 {

	public static final String CATALOG_SERVICE="http://mobvie-catalouge-service";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getMoviePath(Long movieInfoId) {
	var respone= restTemplate.getForEntity(CATALOG_SERVICE + "/movie-info/find-path-by-id/{movieInfoId}",String.class,movieInfoId );
		return respone.getBody();
	}
}
