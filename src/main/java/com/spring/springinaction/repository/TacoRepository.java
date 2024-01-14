package com.spring.springinaction.repository;

import com.spring.springinaction.domain.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
