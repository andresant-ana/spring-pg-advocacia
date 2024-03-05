package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_ESTADO")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ADVOGADO")
    @SequenceGenerator(
            name = "ID_ADVOGADO",
            sequenceName = "ID_ADVOGADO",
            initialValue = 1, allocationSize = 1
    )
    @Column(name = "ID_ESTADO")
    private int id;

    @Column(name = "NM_ESTADO")
    private String nome;

    private String sigla;

}
