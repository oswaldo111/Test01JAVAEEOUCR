package com.test01javaeeoucr.test01javaeeoucr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01javaeeoucr.test01javaeeoucr.model.categoriaoucr;
import com.test01javaeeoucr.test01javaeeoucr.repository.categoriaoucrRepository;

@Service
public class categoriaoucrService {

     @Autowired
          private categoriaoucrRepository categoriaoucrRepository;
      
          public List<categoriaoucr> listarTodas() {
              return categoriaoucrRepository.findAll();
          }
      
          public categoriaoucr guardar(categoriaoucr categoriaoucr) {
              return categoriaoucrRepository.save(categoriaoucr);
          }
      
          public categoriaoucr obtenerPorId(Long id) {
              return categoriaoucrRepository.findById(id).orElse(null);
          }
      
          public void eliminar(Long id) {
              categoriaoucrRepository.deleteById(id);
          }
}
