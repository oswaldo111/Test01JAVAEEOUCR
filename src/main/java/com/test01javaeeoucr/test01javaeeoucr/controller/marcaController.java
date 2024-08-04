package com.test01javaeeoucr.test01javaeeoucr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeeoucr.test01javaeeoucr.model.marcaoucr;
import com.test01javaeeoucr.test01javaeeoucr.service.marcaoucrService;

@Controller
@RequestMapping("marca")
public class marcaController {

    @Autowired
    private marcaoucrService marcaoucrService;

    @GetMapping
    public String listarPersonas(Model model) {
        model.addAttribute("marcas", marcaoucrService.listarTodas());
        return "marca/marca-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevamarca(Model model) {
        model.addAttribute("marca", new marcaoucr());
        return "marca/marca-forn";
    }

    @PostMapping
    public String guardarmarca(marcaoucr marcaoucr) {
        marcaoucrService.guardar(marcaoucr);
        return "redirect:/marca";
    }

     @GetMapping("/editar/{id}")
      public String mostrarFormularioEditarMarca(@PathVariable Long id, Model model) {
          model.addAttribute("marca", marcaoucrService.obtenerPorId(id));
          return "marca/marca-forn";
      }
  
      @GetMapping("/eliminar/{id}")
      public String eliminarMarca(@PathVariable Long id) {
          marcaoucrService.eliminar(id);
          return "redirect:/marca";
      }
}
