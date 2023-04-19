package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByBrandAndName(String brand, String name);
}