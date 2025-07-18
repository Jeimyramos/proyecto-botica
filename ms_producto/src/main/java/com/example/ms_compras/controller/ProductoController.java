package com.example.ms_compras.controller;

import com.example.ms_compras.entity.Producto;
import com.example.ms_compras.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto findById(@PathVariable int id) {
        return productoService.findById(id);
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.Save(producto);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable int id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoService.update(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productoService.delete(id);
    }

}
