package com.codingdojo.DojosAndNinjas.services;

import com.codingdojo.DojosAndNinjas.models.Dojo;
import com.codingdojo.DojosAndNinjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;

    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }

    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo= dojoRepository.findById(id);

        return optionalDojo.orElse(null);
    }

    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }
}
