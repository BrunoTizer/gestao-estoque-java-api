package br.com.simplebyte.domains;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@With
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EstoqueAtual {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToOne
    private Produto produto;
    private Integer quantidadeAtual;
    private Date dataUltimaAtualizacao;

}
