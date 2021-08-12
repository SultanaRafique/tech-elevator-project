package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@Service
public class RestCatPicService implements CatPicService {

	private static final String BASE_API_URL = "https://random-cat-api.netlify.app/.netlify/functions/api/";

private final RestTemplate restTemplate;


public RestCatPicService(){
	this.restTemplate = new RestTemplate();

}

	@Override
	public CatPic getPic() {
	return restTemplate.getForObject(BASE_API_URL, CatPic.class);

	}

}	
