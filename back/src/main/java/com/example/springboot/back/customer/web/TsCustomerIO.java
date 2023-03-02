package com.example.springboot.back.customer.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TsCustomerIO {
   
    private String corRegNo;
    private String customerName;    
    private String typeCode;
    private String email;
    private String region1;
    private String region2;
    private String fax;
    private String web;
    private String address1;
    private String address2;
    private String highCustomer;
    private String note;
    private String tel;
    private String semail;

    
}
