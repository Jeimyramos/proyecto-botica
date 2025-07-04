package com.example.ms_compras.controller;

import com.example.ms_compras.entity.Compras;
import com.example.ms_compras.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {
    @Autowired
    private ComprasService comprasService;

    @GetMapping
    public List<Compras> findAll() {
        return comprasService.findAll();
    }

    @GetMapping("/{id}")
    public Compras findById(@PathVariable int id) {
        return comprasService.findById(id);
    }

    @PostMapping
    public Compras create(@RequestBody Compras compras) {
        return comprasService.Save(compras);
    }

    @PutMapping("/{id}")
    public Compras update(@PathVariable int id, @RequestBody Compras compras) {
        compras.setId(id);
        return comprasService.update(compras);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        comprasService.delete(id);
    }

}
