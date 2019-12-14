package com.spring.microservices.msscbrewery.services;

import com.spring.microservices.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CuntomerServices {

    CustomerDto getCustomerById(UUID customerId);
}
