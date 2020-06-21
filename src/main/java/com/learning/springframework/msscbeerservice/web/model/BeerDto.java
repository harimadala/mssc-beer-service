package com.learning.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDatetime lastModifiedDate;

    private String beerName;
    private BeerStyleEnum beerStyle;

    private LONG upc;

    private BigDecimal price;

    private Integer quantityOnHand;

}
