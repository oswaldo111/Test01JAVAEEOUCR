package com.test01javaeeoucr.test01javaeeoucr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01javaeeoucr.test01javaeeoucr.model.clienteoucr;
import com.test01javaeeoucr.test01javaeeoucr.repository.clienteoucrRepository;

@Service
public class clienteoucrService {

     @Autowired
    private clienteoucrRepository clienteoucrRepository;

    public List<clienteoucr> listarTodas() {
        return clienteoucrRepository.findAll();
    }

    public clienteoucr guardar(clienteoucr clienteoucr) {
        return clienteoucrRepository.save(clienteoucr);
    }

    public clienteoucr obtenerPorId(Long id) {
        return clienteoucrRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        clienteoucrRepository.deleteById(id);
    }
}
