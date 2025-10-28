package br.com.simplebyte.gateways.dtos.request;

import br.com.simplebyte.domains.Marca;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MarcaRequestDto {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    private Boolean ativo = true;

    public Marca toMarca() {
        return Marca.builder()
                .nome(this.nome)
                .ativo(this.ativo)
                .build();
    }
}
