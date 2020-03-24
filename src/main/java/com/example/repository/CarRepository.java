package com.example.repository;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.example.model.Car;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;

@Component
public class CarRepository extends ResourceRepositoryBase<Car, String> {

    private ConcurrentHashMap<String, Car> cars = new ConcurrentHashMap<String, Car>();
    
    public CarRepository(){
        super(Car.class);
    }

    @Override
    public ResourceList<Car> findAll(QuerySpec querySpec) {
        return querySpec.apply(cars.values());
    }

    //PATCH
    @Override
    public <S extends Car> S save(S resource) {
        cars.put(resource.getId(), resource);
        return (S) cars.get(resource.getId());
    }

    //POST
    @Override
    public <S extends Car> S create(S resource) {
        resource.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        return save(resource);
    }
    
}
