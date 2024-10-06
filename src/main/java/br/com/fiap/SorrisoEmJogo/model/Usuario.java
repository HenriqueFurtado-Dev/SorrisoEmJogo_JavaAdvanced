package br.com.fiap.SorrisoEmJogo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id") // A coluna deve ser corretamente mapeada
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @Column(name = "pontos_recompensa")
    private Float pontosRecompensa;
}
