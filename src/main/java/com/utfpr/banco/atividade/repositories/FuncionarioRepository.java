package com.utfpr.banco.atividade.repositories;

import com.utfpr.banco.atividade.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
