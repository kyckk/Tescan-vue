package com.example.springboot.back.customer.web;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerInput implements Serializable{
   //keyword(검색)
   /* COR_REG_NO 사업자 등록번호(not null) */
   private String corRegNo;
   /* CUSTOMER_NAME 고객명(not null) */
   private String customerName;
   /* TYPECODE 타입 코드*/
   private String typeCode;
   /* EMAIL 이메일 */
   private String email;
   /* REGION1 */
   private String region1;   
   /* REGION1 */
   private String region2;
   /* FAX 팩스 */
   private String fax;
   /* WEB 웹사이트*/
   private String web;
   /* ADDRESS1 주소 */
   private String address1;
   /* ADDRESS2 상세 주소 */
   private String address2;
   /* HIGH_CUSTOMER 상위 거래처 */
   private String highCustomer;
   /* NOTE 비고 */
   private String note;
   /* TEL 전화번호 */
   private String tel;
   // /*  SEMAIL */
   // private String semail;
    
}
