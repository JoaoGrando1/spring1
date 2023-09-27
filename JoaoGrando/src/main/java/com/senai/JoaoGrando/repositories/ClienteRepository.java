package com.senai.JoaoGrando.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.JoaoGrando.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}