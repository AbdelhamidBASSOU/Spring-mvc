package com.mvc.demo.web;

import com.mvc.demo.entity.Commande;
import com.mvc.demo.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("command")
public class RestCommande {
    @Autowired
    private CommandService commandService;
    @PostMapping(path = "/")
    public Commande addCommand(Commande commande){
        return commandService.addCommande(commande);
    }
}
