package com.fiap.desafio.dto;

import com.fiap.desafio.domain.Paciente;

import javax.persistence.Column;

public class PacienteDTO {

    private String nome;
    private long cpf;
    private String convenio;
    private String cep;
    private String endereco;
    private String numero;
    private String bairro;
    private int ddd;
    private long celular;

    public PacienteDTO(){

    }

    public PacienteDTO(Paciente paciente){
        setNome(paciente.getNome());
        setCpf(paciente.getCpf());
        setConvenio(paciente.getConvenio());
        setCep(paciente.getCep());
        setEndereco(paciente.getEndereco());
        setNumero(paciente.getNumero());
        setBairro(paciente.getBairro());
        setDdd(paciente.getDdd());
        setCelular(paciente.getCelular());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
}
