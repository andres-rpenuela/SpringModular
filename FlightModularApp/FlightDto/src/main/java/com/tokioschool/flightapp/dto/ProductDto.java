package com.tokioschool.flightapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private String category;
    private int stock;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal taxes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
