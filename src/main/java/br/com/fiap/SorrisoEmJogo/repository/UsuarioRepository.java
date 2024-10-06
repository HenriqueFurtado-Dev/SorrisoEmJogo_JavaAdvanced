package br.com.fiap.SorrisoEmJogo.repository;

import br.com.fiap.SorrisoEmJogo.model.Usuario;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
