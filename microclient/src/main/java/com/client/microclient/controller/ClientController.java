package com.client.microclient.controller;

import com.client.microclient.beans.LivreBean;
import com.client.microclient.proxy.MicroServiceLivreProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    MicroServiceLivreProxy microServiceLivreProxy;

    @RequestMapping("/")
    public String accueil(Model model){

      List<LivreBean> livres = microServiceLivreProxy.listeLivres();

      model.addAttribute("livres", livres);

      return "Accueil";
    }
}
