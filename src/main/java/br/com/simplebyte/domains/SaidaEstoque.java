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
public class SaidaEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    private Produto produto;
    private Integer quantidade;
    private Date dataSaida;

}
