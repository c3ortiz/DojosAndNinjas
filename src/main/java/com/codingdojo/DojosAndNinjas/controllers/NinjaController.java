package com.codingdojo.DojosAndNinjas.controllers;

import com.codingdojo.DojosAndNinjas.models.Dojo;
import com.codingdojo.DojosAndNinjas.models.Ninja;
import com.codingdojo.DojosAndNinjas.services.DojoService;
import com.codingdojo.DojosAndNinjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NinjaController {

    @Autowired
    NinjaService ninjaService;

    @Autowired
    DojoService dojoService;

    @GetMapping("/ninjas")
    public String ninjas(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Ninja> ninjas = ninjaService.allNinjas();
        model.addAttribute("ninjas", ninjas);

        return "ninjas/ninjas.jsp";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);

        return "ninjas/newNinja.jsp";
    }

    @PostMapping("/ninjas/new")
    public String saveNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Ninja> ninjas = ninjaService.allNinjas();
            model.addAttribute("ninjas", ninjas);
            return "ninjas/newNinja.jsp";
        } else {
            ninjaService.createNinja(ninja);

            return "redirect:/ninjas";
        }
    }
}
