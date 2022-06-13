package com.fc.mairiedigital.mdigitkati.repository;

import com.fc.mairiedigital.mdigitkati.model.Personnes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonneRepository extends JpaRepository<Personnes,Integer> {
    Optional<Personnes> findByEmailAndPassword(String email,String password);
}
