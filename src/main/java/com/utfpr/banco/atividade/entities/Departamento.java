package com.utfpr.banco.atividade.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name="departamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Transient
    @OneToMany
    @JoinColumn(name = "funcionario_id")
    private List<Funcionario> funcionaios;

}
