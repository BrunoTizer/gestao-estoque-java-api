package br.com.simplebyte.domains;

import jakarta.persistence.*;
import lombok.*;

@With
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private Boolean ativo;

}
