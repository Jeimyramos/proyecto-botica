package com.example.ms_compras.service.impl;

import com.example.ms_compras.entity.Compras;
import com.example.ms_compras.feign.CatalogoFeign;
import com.example.ms_compras.repository.ComprasRepository;
import com.example.ms_compras.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprasServiceImpl implements ComprasService {
    @Autowired
    private CatalogoFeign catalogoFeign;

    @Autowired
    private ComprasRepository comprasRepository;

    @Override
    public List<Compras> findAll() {
        return comprasRepository.findAll();
    }

    @Override
    public Compras findById(int id) {
        Compras compras = comprasRepository.findById(id).get();
        compras.setCategoriaDto(catalogoFeign.buscarCategoria(compras.getCategoriaId()).getBody());
        return compras;
    }

    @Override
    public Compras Save(Compras compras) {
        return comprasRepository.save(compras);
    }

    @Override
    public Compras update(Compras compras) {
        return comprasRepository.save(compras);
    }

    @Override
    public void delete(int id) {
        comprasRepository.deleteById(id);
    }
}
