package com.example.model;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;

@Data
@JsonApiResource(type = "car", resourcePath = "cars")
public class Car {

    @JsonApiId
    private String id;

    private String make;
    private String model;
    private Integer year;

}
