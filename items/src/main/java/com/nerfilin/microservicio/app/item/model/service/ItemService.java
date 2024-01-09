package com.nerfilin.microservicio.app.item.model.service;

import com.nerfilin.microservicio.app.item.model.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
