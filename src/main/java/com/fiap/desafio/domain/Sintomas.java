package com.fiap.desafio.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_sintomas")
public class Sintomas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;

    public Sintomas(){

    }

    public Sintomas(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sintomas sintomas = (Sintomas) o;
        return id == sintomas.id && nome.equals(sintomas.nome) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sintomas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
