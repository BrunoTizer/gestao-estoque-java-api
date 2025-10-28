package br.com.simplebyte.gateways.dtos.request;

import br.com.simplebyte.domains.ConfiguracoesFornecedor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class ConfiguracoesFornecedorRequestDto {

    @NotBlank(message = "ID do fornecedor é obrigatório")
    private String fornecedorId;

    @NotNull(message = "Meses de planejamento é obrigatório")
    private Integer mesesPlanejamento;

    @NotNull(message = "Meses mínimos é obrigatório")
    private Integer mesesMinimos;

    @NotNull(message = "Prazo de entrega é obrigatório")
    private Integer prazoEntregaDias;

    private Boolean ativo = true;

    public ConfiguracoesFornecedor toConfiguracoesFornecedor() {
        return ConfiguracoesFornecedor.builder()
                .mesesPlanejamento(this.mesesPlanejamento)
                .mesesMinimos(this.mesesMinimos)
                .prazoEntregaDias(this.prazoEntregaDias)
                .ativo(this.ativo)
                .createdAt(new Date())
                .updatedAt(new Date())
                .build();
    }
}
