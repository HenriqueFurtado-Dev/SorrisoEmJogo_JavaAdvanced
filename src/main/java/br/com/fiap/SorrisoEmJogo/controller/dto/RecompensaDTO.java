package br.com.fiap.SorrisoEmJogo.controller.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RecompensaDTO {

    @NotNull(message = "Descrição é obrigatória")
    private String descricao;

    @NotNull(message = "Pontos necessários são obrigatórios")
    private Float pontosNecessarios;
}
