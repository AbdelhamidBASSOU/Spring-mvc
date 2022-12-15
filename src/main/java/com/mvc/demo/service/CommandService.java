package com.mvc.demo.service;

import com.mvc.demo.entity.Commande;

import java.util.List;

public interface CommandService {
    List<Commande> getAllCommande();
    Commande getCommandeById(Long id);
    Commande getCommandeByRef(String ref);
    Commande addCommande(Commande commande);
    String deleteCommande(Long id);

}
