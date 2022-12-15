package com.mvc.demo.web;

import com.mvc.demo.entity.AppelOffre;
import com.mvc.demo.service.AppelOffreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class AppelOffreController {

      private  AppelOffreService appelOffreService;
@GetMapping(path = "/appelOffre")
    public String appelOffre (Model model) {
    List<AppelOffre> appelOffreList=appelOffreService.findAll();
    model.addAttribute("listAppelOffre" , appelOffreList);
return "appelOffre";
    }
    @GetMapping(path = "/delete")
    public String delete(@RequestParam("ref") String ref){
    appelOffreService.deleteByRef(ref);
    return "redirect:/appelOffre";
    }
    @PostMapping("/save")
    public AppelOffre Add(@RequestBody AppelOffre appelOffre) {
     appelOffreService.save(appelOffre);
        return appelOffre;
    }

    @PutMapping(path = "/update")
    public AppelOffre update(@RequestBody AppelOffre appelOffre){
    appelOffreService.update(appelOffre);
    return appelOffre;
    }
}
