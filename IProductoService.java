package com.gnw.crud.service;

import com.gnw.crud.model.Producto;

import java.util.List;

public interface IProductoService {
    //READ
    List<Producto> traerProducto();
    Producto buscarProducto (Long id);
    //CREATE
    Producto crearProducto (Producto prod);
    //UPDATE
    Producto editarProducto (Long id, Producto producto);
    //DELETE
    boolean eliminarProducto(Long id);
}