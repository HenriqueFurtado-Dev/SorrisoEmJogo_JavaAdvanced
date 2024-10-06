package br.com.fiap.SorrisoEmJogo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "procedimento")
public class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long procedimentoId;

    private String nome;
    private String descricao;
}
