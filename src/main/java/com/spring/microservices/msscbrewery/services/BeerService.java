package com.spring.microservices.msscbrewery.services;

import com.spring.microservices.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
