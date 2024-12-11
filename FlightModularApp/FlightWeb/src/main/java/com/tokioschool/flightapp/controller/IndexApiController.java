package com.tokioschool.flightapp.controller;

import com.tokioschool.flightapp.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
public class IndexApiController {

    @GetMapping({"","/"})
    public ResponseEntity<ProductDto> getProductHandler(){
        final ProductDto productDto = ProductDto.builder()
                .id(1L)
                .name("Coca-Cola")
                .description("Un refresco")
                .stock(10)
                .price(BigDecimal.ONE)
                .discount(BigDecimal.ZERO)
                .taxes(BigDecimal.ZERO)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now().plusDays(20))
                .build();
        return ResponseEntity.ok(productDto);
    }
}
