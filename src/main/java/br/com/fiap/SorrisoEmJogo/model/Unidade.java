package br.com.fiap.SorrisoEmJogo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "unidade")
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long unidadeId;

    private String nome;
    private String estado;
    private String cidade;
    private String endereco;
}
