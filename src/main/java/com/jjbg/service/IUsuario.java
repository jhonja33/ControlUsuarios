package com.jjbg.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jjbg.model.Usuario;

@EnableJpaRepositories
@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{
	
}
