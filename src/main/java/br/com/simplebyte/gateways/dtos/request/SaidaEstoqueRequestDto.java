package br.com.simplebyte.gateways.dtos.request;

import br.com.simplebyte.domains.SaidaEstoque;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class SaidaEstoqueRequestDto {

    @NotBlank(message = "ID do produto é obrigatório")
    private String produtoId;

    @NotNull(message = "Quantidade é obrigatória")
    private Integer quantidade;

    public SaidaEstoque toSaidaEstoque() {
        return SaidaEstoque.builder()
                .quantidade(this.quantidade)
                .dataSaida(new Date())
                .build();
    }
}
