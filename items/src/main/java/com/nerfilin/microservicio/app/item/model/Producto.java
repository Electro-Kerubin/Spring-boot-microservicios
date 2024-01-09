package com.nerfilin.microservicio.app.item.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    private Long id;
    private String nombre;
    private Double precio;
    private Date createAt;
    private Integer port;

}
