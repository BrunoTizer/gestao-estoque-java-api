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
public class ConfiguracoesFornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToOne
    private Fornecedor fornecedor;
    private Integer mesesPlanejamento;
    private Integer mesesMinimos;
    private Integer prazoEntregaDias;
    private Boolean ativo;
    private Date createdAt;
    private Date updatedAt;

}
