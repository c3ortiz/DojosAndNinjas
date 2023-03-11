package com.codingdojo.DojosAndNinjas.controllers;

import com.codingdojo.DojosAndNinjas.models.Dojo;
import com.codingdojo.DojosAndNinjas.models.Ninja;
import com.codingdojo.DojosAndNinjas.services.DojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class DojoController {

    @Autowired
    DojoService dojoService;

    @GetMapping("/")
    public String home() {
        return "redirect:/dojos";
    }

    @GetMapping("/dojos")
    public String dojos(@ModelAttribute("dojo") Dojo dojo, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);

        return "dojos/dojos.jsp";
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);

        return "dojos/newDojo.jsp";
    }

    @PostMapping("/dojos/new")
    public String saveDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Dojo> dojos = dojoService.allDojos();
            model.addAttribute("dojos", dojos);
            return "dojos/newDojo.jsp";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/dojos";
        }
    }

    @GetMapping("/dojos/{id}")
    public String dojo(@PathVariable("id") Long id, Model model) {
        model.addAttribute("dojo", dojoService.findDojo(id).getName());
        model.addAttribute("ninjasInDojo", dojoService.findDojo(id).getNinjas());

        return "dojos/dojo.jsp";
    }
}
