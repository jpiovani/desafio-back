package com.fiap.desafio.dto;

import com.fiap.desafio.domain.Sintomas;

public class SintomasDTO {

    private String nome;

    public SintomasDTO(){

    }

    public SintomasDTO(Sintomas sintomas){
        setNome(sintomas.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
