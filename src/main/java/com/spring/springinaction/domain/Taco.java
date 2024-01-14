package com.spring.springinaction.domain;

import lombok.Data;
import java.util.List;
import java.util.Date;

@Data
public class Taco {
    private Long id;
    private Date createdAt;
    private String name;
    private List<Ingredient> ingredients;
}
