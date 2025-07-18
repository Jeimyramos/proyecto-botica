package com.example.ms_compras.service;

import com.example.ms_compras.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(int id);
    Producto Save(Producto producto);
    Producto update(Producto producto);
    void delete(int id);
}
