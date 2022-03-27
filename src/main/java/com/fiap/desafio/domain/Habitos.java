package com.fiap.desafio.domain;

import com.fiap.desafio.dto.HabitosDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_habitos")
public class Habitos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;

    public Habitos(){

    }

    public Habitos(HabitosDTO habitosDTO){
        setNome(habitosDTO.getNome());
    }

    public Habitos(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitos habitos = (Habitos) o;
        return id == habitos.id && nome.equals(habitos.nome);
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
        return "Habitos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
