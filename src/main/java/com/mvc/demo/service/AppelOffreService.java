package com.mvc.demo.service;

import com.mvc.demo.entity.AppelOffre;

import java.util.List;

public interface AppelOffreService {

    String deleteByRef(String ref);
    AppelOffre findByRef(String ref);

    List<AppelOffre> findAll();

    String delete(String ref);

    AppelOffre getOne(Long aLong);

    AppelOffre save(AppelOffre appelOffre);

    AppelOffre update(AppelOffre appelOffre);

    List<AppelOffre> getAll();
}
