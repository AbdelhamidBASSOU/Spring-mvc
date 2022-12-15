package com.mvc.demo.repositories;

import com.mvc.demo.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long> {
    Commande findByRef(String ref);
}
