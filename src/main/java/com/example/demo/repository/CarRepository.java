package com.example.demo.repository;

import com.example.demo.domain.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, String> {
    List<Car> findByBrand(String brand);
}
