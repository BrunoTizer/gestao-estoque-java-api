package br.com.simplebyte.gateways.dtos.request;

import br.com.simplebyte.domains.EstoqueAtual;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class EstoqueAtualRequestDto {

    @NotBlank(message = "ID do produto é obrigatório")
    private String produtoId;

    @NotNull(message = "Quantidade é obrigatória")
    private Integer quantidadeAtual;

    public EstoqueAtual toEstoqueAtual() {
        return EstoqueAtual.builder()
                .quantidadeAtual(this.quantidadeAtual)
                .dataUltimaAtualizacao(new Date())
                .build();
    }
}
