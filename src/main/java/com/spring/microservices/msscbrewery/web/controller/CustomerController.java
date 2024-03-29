package com.spring.microservices.msscbrewery.web.controller;

import com.spring.microservices.msscbrewery.services.CuntomerServices;
import com.spring.microservices.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CuntomerServices cuntomerServices;

    public CustomerController(CuntomerServices cuntomerServices) {
        this.cuntomerServices = cuntomerServices;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(cuntomerServices.getCustomerById(customerId), HttpStatus.OK);
    }

}
