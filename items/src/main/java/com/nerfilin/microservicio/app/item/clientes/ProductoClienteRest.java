package com.nerfilin.microservicio.app.item.clientes;

import com.nerfilin.microservicio.app.item.model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest
{
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Producto> listar();

    @RequestMapping(value = "/ver/{id}", method = RequestMethod.GET)
    public Producto detalle(@PathVariable Long id);
}
