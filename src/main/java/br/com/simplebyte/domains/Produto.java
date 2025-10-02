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
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String codigoProduto;
    private String nomeProduto;
    @ManyToOne
    private Fornecedor fornecedor;
    @ManyToOne
    private Marca marca;
    private Boolean ativo;

}
