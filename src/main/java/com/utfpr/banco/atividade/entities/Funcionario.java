package com.utfpr.banco.atividade.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="funcionarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "quantidade_dependentes")
    private Integer qtdDpn;
    private Double salario;
    private String cargo;
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Departamento departamento;

}
