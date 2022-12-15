package com.mvc.demo.service.implementation;

import com.mvc.demo.entity.AppelOffre;
import com.mvc.demo.entity.Status;
import com.mvc.demo.repositories.AoRepository;
import com.mvc.demo.service.AppelOffreService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppelOffreServiceImpl implements AppelOffreService {
    @Override
    public String deleteByRef(String ref) {
        return aoRepository.deleteByRef(ref);
    }

    @Override
    public AppelOffre findByRef(String ref) {
        return aoRepository.findByRef(ref);
    }

    @Override
    public List<AppelOffre> findAll() {
        return aoRepository.findAll();
    }

    @Override
    @Transactional
    public String delete(String ref) {
        return aoRepository.deleteByRef(ref);
    }

    @Override
    public AppelOffre getOne(Long aLong) {
        return aoRepository.findById(aLong).orElse(null);
    }

    @Override
    public AppelOffre save(AppelOffre appelOffre){

        if (this.findByRef(appelOffre.getRef()) != null) return null;
        appelOffre.setStatus(Status.open);
        return aoRepository.save(appelOffre);
    }

    @Override
    public AppelOffre update(AppelOffre appelOffre) {
        AppelOffre appelOffre1 = this.findByRef(appelOffre.getRef());
        if (appelOffre1 == null || appelOffre1.getId() == null || appelOffre1.getFournisseur()==null || appelOffre1.getStock()==null){
            throw new IllegalStateException("appeld'offre Not Found");
        }else {
            appelOffre1 = appelOffre;
            return aoRepository.save(appelOffre1);
        }
    }

    @Override
    public List<AppelOffre> getAll() {
        return aoRepository.findAll();
    }

    @Autowired
    AoRepository aoRepository;
}
