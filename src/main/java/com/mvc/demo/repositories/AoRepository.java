package com.mvc.demo.repositories;

import com.mvc.demo.entity.AppelOffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AoRepository extends JpaRepository<AppelOffre,Long> {
    @Transactional
    String deleteByRef(String ref);
    AppelOffre findByRef(String ref);




}
