package com.fiap.desafio.dto;

import com.fiap.desafio.domain.Habitos;

public class HabitosDTO {

    private String nome;

    public HabitosDTO(){

    }

    public HabitosDTO(Habitos habitos){
        setNome(habitos.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
