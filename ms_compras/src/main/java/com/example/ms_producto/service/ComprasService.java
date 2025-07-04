package com.example.ms_compras.service;

import com.example.ms_compras.entity.Compras;

import java.util.List;

public interface ComprasService {
    List<Compras> findAll();
    Compras findById(int id);
    Compras Save(Compras compras);
    Compras update(Compras compras);
    void delete(int id);
}
