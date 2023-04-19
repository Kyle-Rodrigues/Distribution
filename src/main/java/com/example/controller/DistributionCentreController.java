package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.DistributionCentre;
import com.example.model.Item;
import com.example.repository.DistributionCentreRepository;
import com.example.repository.ItemRepository;

@RestController
@RequestMapping("/distribution-centre")
public class DistributionCentreController {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private DistributionCentreRepository distributionCentreRepository;

    @GetMapping
    public List<DistributionCentre> getAllCentres() {
        return (List<DistributionCentre>) distributionCentreRepository.findAll();
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemRepository.deleteById(id);
    }

    @GetMapping("/items")
    public List<Item> listItems() {
        return (List<Item>) itemRepository.findAll();
    }

    @GetMapping("/items/{brand}/{name}")
    public List<Item> getItemsByBrandAndName(@PathVariable String brand, @PathVariable String name) {
        return itemRepository.findByBrandAndName(brand, name);
    }
}