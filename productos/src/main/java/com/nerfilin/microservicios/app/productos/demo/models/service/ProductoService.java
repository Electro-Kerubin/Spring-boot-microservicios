package com.nerfilin.microservicios.app.productos.demo.models.service;

import com.nerfilin.microservicios.app.productos.demo.models.entity.Producto;

import java.util.List;

public interface ProductoService {

    public List<Producto> findAll();
    public Producto findById(Long id);
}
