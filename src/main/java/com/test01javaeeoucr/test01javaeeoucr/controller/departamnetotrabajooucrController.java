package com.test01javaeeoucr.test01javaeeoucr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeeoucr.test01javaeeoucr.model.departamnetotrabajooucr;
import com.test01javaeeoucr.test01javaeeoucr.service.departamnetotrabajooucrService;



@Controller
@RequestMapping("departamneto")
public class departamnetotrabajooucrController {
    
    @Autowired
    private departamnetotrabajooucrService departamnetotrabajooucrService;

    @GetMapping
    public String listarDepertamento(Model model) {
        model.addAttribute("departamento", departamnetotrabajooucrService.listarTodas());
        return "departamento/departamento-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuoDepartamento(Model model) {
        model.addAttribute("departamento", new departamnetotrabajooucr());
        return "departamento/departamento-forn";
    }

    @PostMapping
    public String guardardepartamento(departamnetotrabajooucr departamentooucr) {
        departamnetotrabajooucrService.guardar(departamentooucr);
        return "redirect:/departamneto";
    }

     @GetMapping("/editar/{id}")
      public String mostrarFormularioEditardepartamento(@PathVariable Long id, Model model) {
          model.addAttribute("departamento", departamnetotrabajooucrService.obtenerPorId(id));
          return "departamento/departamento-forn";
      }
  
      @GetMapping("/eliminar/{id}")
      public String eliminardepartamento(@PathVariable Long id) {
          departamnetotrabajooucrService.eliminar(id);
          return "redirect:/departamneto";
      }
}
