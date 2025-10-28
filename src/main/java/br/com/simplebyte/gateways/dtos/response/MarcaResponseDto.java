package br.com.simplebyte.gateways.dtos.response;

import br.com.simplebyte.domains.Marca;

public record MarcaResponseDto(
        String id,
        String nome,
        Boolean ativo
) {
    public static MarcaResponseDto fromMarca(Marca marca) {
        return new MarcaResponseDto(
                marca.getId(),
                marca.getNome(),
                marca.getAtivo()
        );
    }
}
