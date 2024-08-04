package com.test01javaeeoucr.test01javaeeoucr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeeoucr.test01javaeeoucr.service.categoriaoucrService;

@Controller
@RequestMapping("categoria")
public class categoriaoucrController {

    @Autowired
    private categoriaoucrService categoriaoucrService;

    @GetMapping
      public String listarPersonas(Model model) {
          model.addAttribute("categorias", categoriaoucrService.listarTodas());
          return "categoria-list";
      }
}
