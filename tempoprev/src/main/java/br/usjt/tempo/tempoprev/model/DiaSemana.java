package br.usjt.tempo.tempoprev.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_semana")
@Getter @Setter @ToString
public class DiaSemana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semana")
    private Long id;
    @Column(name = "dia_semana")
    private String dia;

   
}
