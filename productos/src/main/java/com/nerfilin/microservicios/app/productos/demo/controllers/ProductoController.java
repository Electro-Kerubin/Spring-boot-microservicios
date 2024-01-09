package com.nerfilin.microservicios.app.productos.demo.controllers;

import com.nerfilin.microservicios.app.productos.demo.models.entity.Producto;
import com.nerfilin.microservicios.app.productos.demo.models.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class ProductoController {

    @Autowired
    private Environment environment;

    @Autowired
    private ProductoService productoService;

    @Value("${server.port}")
    private Integer port;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Producto> listar()
    {
        return productoService.findAll().stream().map(producto -> {
            producto.setPort(port);
            return producto;
        }).collect(Collectors.toList());
    }

    @RequestMapping(value = "/ver/{id}", method = RequestMethod.GET)
    public Producto detalle(@PathVariable Long id)
    {
        Producto producto = productoService.findById(id);
        producto.setPort(port);

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return producto;
    }

}
