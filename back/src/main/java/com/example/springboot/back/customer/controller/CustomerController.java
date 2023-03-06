package com.example.springboot.back.customer.controller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


import org.springframework.web.bind.annotation.*;

import com.example.springboot.back.customer.service.CustomerService;
import com.example.springboot.back.customer.web.CustomerOutput;


@Slf4j
@RequiredArgsConstructor
@CrossOrigin
@RestController
public class CustomerController {
    
    private final CustomerService customerService;

    @GetMapping("/customer/list")
    public List<CustomerOutput> CustomerList() { return customerService.getCustomerList(); }

    // @GetMapping("/customer/{id}")
    // public TsCustomerIO getCustomer(@PathVariable Long id,int startPage) {
    //     return CustomerService.getCustomer(id,startPage);
    // }

    // @PostMapping("/customer")
    // public TsCustomer create(@RequestBody TsCustomerIO customerIO) {
    //     return CustomerService.create(customerIO);
    // }

    // // @PatchMapping("/customer")
    // // public TsCustomer update(@RequestBody TsCustomerIO customerIO) {
    // //     return CustomerService.update(customerIO);
    // // }

    // // @DeleteMapping("/customer/{id}")
    // // public void delete(@PathVariable Long id) {
    // //     CustomerService.delete(id);
    // // }
}
