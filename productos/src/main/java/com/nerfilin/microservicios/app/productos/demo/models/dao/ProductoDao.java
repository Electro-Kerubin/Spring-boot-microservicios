package com.nerfilin.microservicios.app.productos.demo.models.dao;


import com.nerfilin.microservicios.app.productos.demo.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {
}
