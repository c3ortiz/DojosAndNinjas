package com.codingdojo.DojosAndNinjas.repositories;

import com.codingdojo.DojosAndNinjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DojoRepository extends CrudRepository <Dojo, Long> {
    List<Dojo> findAll();
    Optional<Dojo> findById(Long id);
}
