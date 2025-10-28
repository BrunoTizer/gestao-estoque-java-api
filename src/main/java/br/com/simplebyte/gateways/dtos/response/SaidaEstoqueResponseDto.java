package br.com.simplebyte.gateways.dtos.response;

import br.com.simplebyte.domains.SaidaEstoque;

import java.util.Date;

public record SaidaEstoqueResponseDto(
        String id,
        String produtoNome,
        Integer quantidade,
        Date dataSaida
) {
    public static SaidaEstoqueResponseDto fromSaidaEstoque(SaidaEstoque saida) {
        return new SaidaEstoqueResponseDto(
                saida.getId(),
                saida.getProduto().getNomeProduto(),
                saida.getQuantidade(),
                saida.getDataSaida()
        );
    }
}
