package com.example.springboot.back.customer.domain;

import java.util.List;

import com.example.springboot.back.customer.domain.TsCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TsCustomerRepository extends JpaRepository<TsCustomer,String>{
//idx     
//SELECT 
//          TC.COR_REG_NO
//,row_num as rnum
//         ,TC.CUSTOMER_NAME
//         ,TC.TYPECODE
//         ,TC.EMAIL
//         ,TC.REGION1
//         ,TC.REGION2
//         ,TC.FAX
//         ,TC.WEB
//         ,TC.ADDRESS1
//         ,TC.ADDRESS2
//         ,TC.HIGH_CUSTOMER
//         ,TC.NOTE
//         ,TC.TEL
//         ,TC.SEMAIL
//         ,TCE.CUS_NO
//         ,TCE.EQUIP_NO
//         ,TCE.BUY_DATE
//         ,TCE.SERIAL
//         ,TCE.PRICE
//         ,TCL.NAME
//  --       ,TCE.NOTE
//  --       ,TCL.CUS_NO
//    FROM TS_CUSTOMER  TC
//   INNER JOIN TS_CUSTOMER_EQUIP TCE
//      ON (TC.COR_REG_NO = TCE.COR_REG_NO)
//   INNER JOIN TS_CLIENT TCL
//      ON (TC.COR_REG_NO = TCL.COR_REG_NO
//         AND TCE.CUS_NO = TCL.CUS_NO)
//  where rnum between startPage and startpage+10;



    // @Query(value = "SELECT TC.COR_REG_NO,row_num as rnum,TC.CUSTOMER_NAME,TC.TYPECODE,TC.EMAIL,TC.REGION1,TC.REGION2,TC.FAX,TC.WEB,TC.ADDRESS1"+"
    // ,TC.ADDRESS2,TC.HIGH_CUSTOMER,TC.NOTE,TC.TEL,TC.SEMAIL,TCE.CUS_NO,TCE.EQUIP_NO,TCE.BUY_DATE,TCE.SERIAL,TCE.PRICE,TCL.NAME FROM TS_CUSTOMER  TC
    // INNER JOIN TS_CUSTOMER_EQUIP TCE ON (TC.COR_REG_NO = TCE.COR_REG_NO)"+" INNER JOIN TS_CLIENT TCL ON (TC.COR_REG_NO = TCL.COR_REG_NO AND TCE.CUS_NO = TCL.CUS_NO)")
    public List<TsCustomer> selectAllRowNum();    
}