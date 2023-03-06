package com.example.springboot.back.customer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    SELECT 
        ROWNUM
        ,TC.COR_REG_NO
        ,TC.CUSTOMER_NAME
        ,TC.TYPECODE
        ,TC.EMAIL
        ,TC.REGION1
        ,TC.REGION2
        ,TC.FAX
        ,TC.WEB
        ,TC.ADDRESS1
        ,TC.ADDRESS2
        ,TC.HIGH_CUSTOMER
        ,TC.NOTE
        ,TC.TEL
        ,TC.SEMAIL
        ,TCE.CUS_NO
        ,TCE.EQUIP_NO
        ,TCE.BUY_DATE
        ,TCE.SERIAL
        ,TCE.PRICE
        ,TCL.NAME
 --       ,TCE.NOTE
 --       ,TCL.CUS_NO
   FROM TS_CUSTOMER  TC
  INNER JOIN TS_CUSTOMER_EQUIP TCE
     ON (TC.COR_REG_NO = TCE.COR_REG_NO)
  INNER JOIN TS_CLIENT TCL
     ON (TC.COR_REG_NO = TCL.COR_REG_NO
        AND TCE.CUS_NO = TCL.CUS_NO)
  WHERE ROWNUM BETWEEN startPage AND endPage;
 */
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TS_CUSTOMER")
@Entity
public class TsCustomer {

    /* rowNum */
    private int idx;

    /* COR_REG_NO 사업자 등록번호(not null) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String corRegNo;
        
    /* CUS_NO 고객번호(not null) */
    private String cusNo;

    /* CUSTOMER_NAME 고객명(not null) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerName;


    /* ADDRESS1 주소 */
    private String address1;

    /* ADDRESS2 상세 주소 */
    private String address2;

    /* TYPECODE 타입 코드*/
    private String typeCode;

    /* EMAIL 이메일 */
    private String email;
    
    /*  SEMAIL 골벵이 뒤의 메일 주소*/
    private String semail;

    /* FAX 팩스 */
    private String fax;

    /* WEB 웹사이트*/
    private String web;

    /* HIGH_CUSTOMER 상위 거래처 */
    private String highCustomer;

    /* TEL 전화번호 */
    private String tel; 

    /* NOTE 비고 */
    private String note;

    /* REGION1 */
    private String region1;
    
    /* REGION2 */
    private String region2;

    
}
