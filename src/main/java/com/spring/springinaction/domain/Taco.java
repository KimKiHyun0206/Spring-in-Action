package com.spring.springinaction.domain;

import lombok.Data;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Data createdAt;
    private String name;
    private List<String> ingredients;
}
