package com.nerfilin.microservicio.app.item.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Producto producto;
    private Integer cantidad;

    //Metodos
    public Double getTotal()
    {
        return producto.getPrecio() * cantidad.doubleValue();
    }
}
