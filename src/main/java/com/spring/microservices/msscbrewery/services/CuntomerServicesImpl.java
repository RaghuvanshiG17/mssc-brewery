package com.spring.microservices.msscbrewery.services;

import com.spring.microservices.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CuntomerServicesImpl implements CuntomerServices {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().customerId(customerId)
                .customerName("testcustomer")
                .build();
    }
}
