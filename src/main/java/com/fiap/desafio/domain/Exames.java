package com.fiap.desafio.domain;

import com.fiap.desafio.dto.ExamesDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_exames")
public class Exames {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;

    public Exames(){

    }

    public Exames(ExamesDTO examesDTO){
        setNome(examesDTO.getNome());
    }

    public Exames(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exames exames = (Exames) o;
        return id == exames.id && nome.equals(exames.nome);
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
        return "Exames{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
