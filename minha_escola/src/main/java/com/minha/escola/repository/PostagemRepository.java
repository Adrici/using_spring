package com.minha.escola.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.minha.escola.model.Aluno;

@Repository
public interface PostagemRepository extends JpaRepository<Aluno, Long> {	
	public List<Aluno> findAllByNomeContainingIgnoreCase (String nome); 

} 