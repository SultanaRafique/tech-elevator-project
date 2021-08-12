package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatFact;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatFactService implements CatFactService {

	//Make sure to implement the RestCatFactService to call this endpoint and return the data as a CatFact
	//object.
	private static final String BASE_API_URL = "https://cat-fact.herokuapp.com/facts/random";



	private final RestTemplate restTemplate;


	public RestCatFactService() {
		this.restTemplate = new RestTemplate();
	}

		@Override
		public CatFact getFact () {

		return restTemplate.getForObject(BASE_API_URL , CatFact.class);

		}

	}
