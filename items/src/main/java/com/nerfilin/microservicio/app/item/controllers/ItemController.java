package com.nerfilin.microservicio.app.item.controllers;

import com.nerfilin.microservicio.app.item.model.Item;
import com.nerfilin.microservicio.app.item.model.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    @Qualifier(value = "serviceFeign")
    private ItemService itemService;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Item> list()
    {
        return itemService.findAll();
    }

    @RequestMapping(value = "/detalle/{id}/{cantidad}", method = RequestMethod.GET)
    public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad)
    {
        return itemService.findById(id, cantidad);
    }
}
