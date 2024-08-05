package com.test01javaeeoucr.test01javaeeoucr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeeoucr.test01javaeeoucr.model.clienteoucr;
import com.test01javaeeoucr.test01javaeeoucr.service.clienteoucrService;

@Controller
@RequestMapping("cliente")
public class clienteoucrController {

     @Autowired
    private clienteoucrService clienteoucrService;

    @GetMapping
    public String listarCliente(Model model) {
        model.addAttribute("cliente", clienteoucrService.listarTodas());
        return "cliente/cliente-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoCliente(Model model) {
        model.addAttribute("cliente", new clienteoucr());
        return "cliente/cliente-forn";
    }

    @PostMapping
    public String guardarCliente(clienteoucr clienteoucr) {
        clienteoucrService.guardar(clienteoucr);
        return "redirect:/cliente";
    }

     @GetMapping("/editar/{id}")
      public String mostrarFormularioEditarCliente(@PathVariable Long id, Model model) {
          model.addAttribute("cliente", clienteoucrService.obtenerPorId(id));
          return "cliente/cliente-forn";
      }
  
      @GetMapping("/eliminar/{id}")
      public String eliminarCliente(@PathVariable Long id) {
          clienteoucrService.eliminar(id);
          return "redirect:/cliente";
      }
}
