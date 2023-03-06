package com.sesatech.apirickymorty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesatech.apirickymorty.entities.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long>{

}
