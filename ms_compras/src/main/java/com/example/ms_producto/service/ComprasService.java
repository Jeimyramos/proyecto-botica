package com.example.ms_compras.service;

import com.example.ms_compras.entity.Compras;

import java.util.List;

public interface ComprasService {Compras
    List<Compras> findAll();
    Compras findById(int id);
    Compras Save(Compras compras);
    Compraso update(Compras compras);
    void delete(int id);
}
