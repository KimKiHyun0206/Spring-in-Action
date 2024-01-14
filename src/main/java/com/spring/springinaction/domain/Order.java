package com.spring.springinaction.domain;

import lombok.Data;

@Data
public class Order {
    private Long id;
    private Data placedAt;
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
