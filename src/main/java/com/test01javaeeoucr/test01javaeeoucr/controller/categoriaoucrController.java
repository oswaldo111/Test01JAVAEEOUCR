package com.test01javaeeoucr.test01javaeeoucr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeeoucr.test01javaeeoucr.model.categoriaoucr;
import com.test01javaeeoucr.test01javaeeoucr.service.categoriaoucrService;

@Controller
@RequestMapping("categoria")
public class categoriaoucrController {

    @Autowired
    private categoriaoucrService categoriaoucrService;

    @GetMapping
    public String listarPersonas(Model model) {
        model.addAttribute("categorias", categoriaoucrService.listarTodas());
        return "categoria/categoria-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaCategoria(Model model) {
        model.addAttribute("categoria", new categoriaoucr());
        return "categoria/categoria-forn";
    }

    @PostMapping
    public String guardarCategoria(categoriaoucr categoriaoucr) {
        categoriaoucrService.guardar(categoriaoucr);
        return "redirect:/categoria";
    }

     @GetMapping("/editar/{id}")
      public String mostrarFormularioEditarCategoria(@PathVariable Long id, Model model) {
          model.addAttribute("categoria", categoriaoucrService.obtenerPorId(id));
          return "categoria/categoria-forn";
      }
  
      @GetMapping("/eliminar/{id}")
      public String eliminarCategoria(@PathVariable Long id) {
          categoriaoucrService.eliminar(id);
          return "redirect:/categoria";
      }
}
