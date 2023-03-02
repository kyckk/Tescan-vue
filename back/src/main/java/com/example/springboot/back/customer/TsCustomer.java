package com.example.springboot.back.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
     CREATE TABLE TS_USER.TS_CUSTOMER
    (
    COR_REG_NO     VARCHAR2(10 BYTE)              NOT NULL,
    CUSTOMER_NAME  VARCHAR2(100 BYTE)             NOT NULL,
    TYPECODE       VARCHAR2(1 BYTE),
    EMAIL          VARCHAR2(50 BYTE),
    REGION1        VARCHAR2(3 BYTE),
    REGION2        VARCHAR2(3 BYTE),
    FAX            VARCHAR2(11 BYTE),
    WEB            VARCHAR2(255 BYTE),
    ADDRESS1       VARCHAR2(255 BYTE),
    ADDRESS2       VARCHAR2(255 BYTE),
    HIGH_CUSTOMER  VARCHAR2(100 BYTE),
    NOTE           VARCHAR2(255 BYTE),
    TEL            VARCHAR2(11 BYTE),
    SEMAIL         VARCHAR2(50 BYTE)
    )
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="TS_CUSTOMER")
@Entity
public class TsCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String corRegNo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
