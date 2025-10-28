package br.com.simplebyte.gateways.dtos.request;

import br.com.simplebyte.domains.Fornecedor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FornecedorRequestDto {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "CNPJ é obrigatório")
    private String cnpj;

    @NotBlank(message = "Telefone é obrigatório")
    private String telefone;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    private Boolean ativo = true;

    public Fornecedor toFornecedor() {
        return Fornecedor.builder()
                .nome(this.nome)
                .cnpj(this.cnpj)
                .telefone(this.telefone)
                .email(this.email)
                .ativo(this.ativo)
                .build();
    }
}
