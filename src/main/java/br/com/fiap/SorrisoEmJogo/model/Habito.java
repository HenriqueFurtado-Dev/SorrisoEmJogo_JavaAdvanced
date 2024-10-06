package br.com.fiap.SorrisoEmJogo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "habito")
public class Habito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String tipo;

    @Column(name = "frequencia_ideal", nullable = false)
    private Float frequenciaIdeal;
}
