package com.gnw.crud.service;

import com.gnw.crud.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Override
    public List<Producto> traerProducto() {
        return List.of();
    }

    @Override
    public Producto buscarProducto(Long id) {
        return null;
    }

    @Override
    public Producto crearProducto(Producto prod) {
        return null;
    }

    @Override
    public Producto editarProducto(Long id, Producto producto) {
        return null;
    }

    @Override
    public boolean eliminarProducto(Long id) {
        return false;
    }
}