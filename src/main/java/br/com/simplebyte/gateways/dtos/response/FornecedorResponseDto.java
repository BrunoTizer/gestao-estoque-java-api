package br.com.simplebyte.gateways.dtos.response;

import br.com.simplebyte.domains.Fornecedor;

public record FornecedorResponseDto(
        String id,
        String nome,
        String cnpj,
        String telefone,
        String email,
        Boolean ativo
) {
    public static FornecedorResponseDto fromFornecedor(Fornecedor fornecedor) {
        return new FornecedorResponseDto(
                fornecedor.getId(),
                fornecedor.getNome(),
                fornecedor.getCnpj(),
                fornecedor.getTelefone(),
                fornecedor.getEmail(),
                fornecedor.getAtivo()
        );
    }
}
