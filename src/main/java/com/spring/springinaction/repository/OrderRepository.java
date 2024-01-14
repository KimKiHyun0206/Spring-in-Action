package com.spring.springinaction.repository;

import com.spring.springinaction.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
