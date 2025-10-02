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
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private Boolean ativo;

}
