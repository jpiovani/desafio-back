package com.fiap.desafio.dto;

import com.fiap.desafio.domain.Exames;

public class ExamesDTO {

    private String nome;

    public ExamesDTO(){

    }

    public ExamesDTO(Exames exames){
        setNome(exames.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
