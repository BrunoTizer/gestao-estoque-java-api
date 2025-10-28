package br.com.simplebyte.gateways.dtos.request;

import br.com.simplebyte.domains.Produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class ProdutoRequestDto {

    @NotBlank(message = "Código do produto é obrigatório")
    private String codigoProduto;

    @NotBlank(message = "Nome do produto é obrigatório")
    private String nomeProduto;

    @NotBlank(message = "ID do fornecedor é obrigatório")
    private String fornecedorId;

    @NotBlank(message = "ID da marca é obrigatório")
    private String marcaId;

    @NotNull(message = "Quantidade é obrigatória")
    private Integer quantidadeAtual;

    private Boolean ativo = true;

    public Produto toProduto() {
        return Produto.builder()
                .codigoProduto(this.codigoProduto)
                .nomeProduto(this.nomeProduto)
                .quantidadeAtual(this.quantidadeAtual)
                .dataUltimaAtualizacao(new Date())
                .ativo(this.ativo)
                .build();
    }
}
