package com.client.microclient.proxy;

import com.client.microclient.beans.LivreBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microlibrary", url = "localhost:9001")
public interface MicroServiceLivreProxy {

    @GetMapping(value="Livres")
    List<LivreBean> listeLivres();

    @GetMapping(value= "Livres/{id}")
    LivreBean afficherUnLivre(@PathVariable("id") int id);


}
