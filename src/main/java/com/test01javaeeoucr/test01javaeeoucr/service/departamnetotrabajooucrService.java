package com.test01javaeeoucr.test01javaeeoucr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01javaeeoucr.test01javaeeoucr.model.departamnetotrabajooucr;

import com.test01javaeeoucr.test01javaeeoucr.repository.departamnetotrabajooucrRepository;

@Service
public class departamnetotrabajooucrService {

    @Autowired
    private departamnetotrabajooucrRepository depa;
    
    public List<departamnetotrabajooucr> listarTodas() {
        return depa.findAll();
    }

    public departamnetotrabajooucr guardar(departamnetotrabajooucr departamnetotrabajooucr) {
        return depa.save(departamnetotrabajooucr);
    }

    public departamnetotrabajooucr obtenerPorId(Long id) {
        return depa.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        depa.deleteById(id);
    }
}
