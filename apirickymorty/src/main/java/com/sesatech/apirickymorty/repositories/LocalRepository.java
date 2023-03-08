package com.sesatech.apirickymorty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesatech.apirickymorty.entities.Local;


@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{

}
