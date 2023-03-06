package com.example.springboot.back.customer.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.back.customer.domain.TsCustomerRepository;
import com.example.springboot.back.customer.domain.TsCustomer;
import com.example.springboot.back.customer.web.CustomerOutput;

// import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



@Slf4j
@RequiredArgsConstructor
@Service
public class CustomerService {

    
    @Autowired
    private TsCustomerRepository customerRepository;


    /**
     * 게시글 목록 가져오기
     */
    public List<CustomerOutput> getCustomerList() {
        // List<TsCustomer> customerEntities = customerRepository.findAll();
        List<TsCustomer> customerEntities = customerRepository.selectAllRowNum();
        List<CustomerOutput> dtos = new ArrayList<>();

        for (TsCustomer entity : customerEntities) {
            CustomerOutput dto = CustomerOutput.builder()
                    .corRegNo(entity.getCorRegNo())
                    .customerName(entity.getCustomerName())
                    .email(entity.getEmail())
                    .region1(entity.getRegion1())
                    .region2(entity.getRegion2())
                    .fax(entity.getFax())
                    .web(entity.getWeb())
                    .address1(entity.getAddress1())
                    .address2(entity.getAddress2())
                    .highCustomer(entity.getHighCustomer())
                    .note(entity.getNote())
                    .tel(entity.getTel())
                    // .semail(entity.getSemail())
                    .build();

            dtos.add(dto);   
        }        
        return dtos;
    }

    // /**
    //  * 게시글 가져오기
    //  */
    // public TsCustomerIO getBoard(Long id,int startPage) {
    //     TsCustomer entity = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
        // int endPage = startPage+10;
    //     return TsCustomerIO.builder()
    //              .startPage(e/getgshs)
    //              .endPage(endPage)
    //             .idx(entity.getIdx())
    //             .title(entity.getTitle())
    //             .contents(entity.getContents())
    //             .author(entity.getAuthor())
    //             .createdat(entity.getCreatedat())
    //             .build();
    // }

    // /**
    //  * 게시글 등록
    //  */
    // public TsCustomer create(TsCustomerIO TsCustomerIO) {
    //     Long cnt = (customerRepository.selectIdx(TsCustomerIO))+1;
    //     TsCustomerIO.setIdx(cnt);
    //     System.out.println(cnt);
    //     TsCustomer entity = TsCustomer.builder()
    //             .idx(TsCustomerIO.getIdx())
    //             .title(TsCustomerIO.getTitle())
    //             .contents(TsCustomerIO.getContents())
    //             .author(TsCustomerIO.getAuthor())
    //             .createdat(LocalDateTime.now())
    //             .build();
    //     return customerRepository.save(entity);
    //     // return customerRepository.saveBoard(entity);
    // }

    // /**
    //  * 게시글 수정
    //  */
    // public TsCustomer update(TsCustomerIO TsCustomerIO) {
    //     TsCustomer entity = customerRepository.findById(TsCustomerIO.getIdx()).orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
    //     entity.setTitle(TsCustomerIO.getTitle());
    //     entity.setContents(TsCustomerIO.getContents());
    //     return customerRepository.save(entity);
    // }

    // /**
    //  * 게시글 삭제
    //  */
    // public void delete(Long id) {
    //     TsCustomer entity = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
    //     customerRepository.delete(entity);
    // }
    
    
}