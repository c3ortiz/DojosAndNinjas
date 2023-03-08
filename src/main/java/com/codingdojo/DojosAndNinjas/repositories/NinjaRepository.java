package com.codingdojo.DojosAndNinjas.repositories;

import com.codingdojo.DojosAndNinjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
    Optional<Ninja> findById(Long id);
}
