package br.com.simplebyte.gateways.dtos.response;

import br.com.simplebyte.domains.Produto;

import java.util.Date;

public record ProdutoResponseDto(
        String id,
        String codigoProduto,
        String nomeProduto,
        String fornecedorNome,
        String marcaNome,
        Integer quantidadeAtual,
        Date dataUltimaAtualizacao,
        Boolean ativo
) {
    public static ProdutoResponseDto fromProduto(Produto produto) {
        return new ProdutoResponseDto(
                produto.getId(),
                produto.getCodigoProduto(),
                produto.getNomeProduto(),
                produto.getFornecedor().getNome(),
                produto.getMarca().getNome(),
                produto.getQuantidadeAtual(),
                produto.getDataUltimaAtualizacao(),
                produto.getAtivo()
        );
    }
}
