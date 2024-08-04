package com.test01javaeeoucr.test01javaeeoucr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01javaeeoucr.test01javaeeoucr.model.marcaoucr;
import com.test01javaeeoucr.test01javaeeoucr.repository.marcaoucrRepository;

@Service
public class marcaoucrService {

    @Autowired
    private marcaoucrRepository marcaoucrRepository;

    public List<marcaoucr> listarTodas() {
        return marcaoucrRepository.findAll();
    }

    public marcaoucr guardar(marcaoucr marcaoucr) {
        return marcaoucrRepository.save(marcaoucr);
    }

    public marcaoucr obtenerPorId(Long id) {
        return marcaoucrRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        marcaoucrRepository.deleteById(id);
    }
}
