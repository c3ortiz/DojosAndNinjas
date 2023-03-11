package com.codingdojo.DojosAndNinjas.services;

import com.codingdojo.DojosAndNinjas.models.Ninja;
import com.codingdojo.DojosAndNinjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }

    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja= ninjaRepository.findById(id);

        return optionalNinja.orElse(null);
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
}
