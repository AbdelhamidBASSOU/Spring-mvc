package com.mvc.demo.web;

import com.mvc.demo.entity.Commande;
import com.mvc.demo.service.CommanItemService;
import com.mvc.demo.service.CommandService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class CommandController {
    @Autowired
        private CommandService commandService;
        @GetMapping(path = "/Command")
        public String getCommend() {
            return "Command.html";
        }

        @PostMapping(path = "/addCom")
    public Commande addCommande( Commande commande){
            commandService.addCommande(commande);
            return commande;
        }
    }

