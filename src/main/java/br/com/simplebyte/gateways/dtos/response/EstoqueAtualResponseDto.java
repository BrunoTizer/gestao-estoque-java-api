package br.com.simplebyte.gateways.dtos.response;

import br.com.simplebyte.domains.EstoqueAtual;

import java.util.Date;

public record EstoqueAtualResponseDto(
        String id,
        String produtoNome,
        Integer quantidadeAtual,
        Date dataUltimaAtualizacao
) {
    public static EstoqueAtualResponseDto fromEstoqueAtual(EstoqueAtual estoque) {
        return new EstoqueAtualResponseDto(
                estoque.getId(),
                estoque.getProduto().getNomeProduto(),
                estoque.getQuantidadeAtual(),
                estoque.getDataUltimaAtualizacao()
        );
    }
}
