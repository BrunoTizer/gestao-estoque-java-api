package br.com.simplebyte.gateways.dtos.response;

import br.com.simplebyte.domains.ConfiguracoesFornecedor;

import java.util.Date;

public record ConfiguracoesFornecedorResponseDto(
        String id,
        String fornecedorNome,
        Integer mesesPlanejamento,
        Integer mesesMinimos,
        Integer prazoEntregaDias,
        Boolean ativo,
        Date createdAt,
        Date updatedAt
) {
    public static ConfiguracoesFornecedorResponseDto fromConfiguracoesFornecedor(ConfiguracoesFornecedor config) {
        return new ConfiguracoesFornecedorResponseDto(
                config.getId(),
                config.getFornecedor().getNome(),
                config.getMesesPlanejamento(),
                config.getMesesMinimos(),
                config.getPrazoEntregaDias(),
                config.getAtivo(),
                config.getCreatedAt(),
                config.getUpdatedAt()
        );
    }
}
