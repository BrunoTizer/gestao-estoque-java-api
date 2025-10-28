package br.com.simplebyte.gateways.dtos.response;

import br.com.simplebyte.domains.Produto;

public record ProdutoResponseDto(
        String id,
        String codigoProduto,
        String nomeProduto,
        String fornecedorNome,
        String marcaNome,
        Boolean ativo
) {
    public static ProdutoResponseDto fromProduto(Produto produto) {
        return new ProdutoResponseDto(
                produto.getId(),
                produto.getCodigoProduto(),
                produto.getNomeProduto(),
                produto.getFornecedor().getNome(),
                produto.getMarca().getNome(),
                produto.getAtivo()
        );
    }
}
