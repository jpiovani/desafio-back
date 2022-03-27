package com.fiap.desafio.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiap.desafio.dto.PacienteDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private long cpf;
    @Column(name = "convenio")
    private String convenio;
    @Column(name = "cep")
    private String cep;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "ddd")
    private int ddd;
    @Column(name = "celular")
    private long celular;

    public Paciente(){

    }

    public Paciente(PacienteDTO pacienteDTO){
        setNome(pacienteDTO.getNome());
        setCpf(pacienteDTO.getCpf());
        setConvenio(pacienteDTO.getConvenio());
        setCep(pacienteDTO.getCep());
        setEndereco(pacienteDTO.getEndereco());
        setNumero(pacienteDTO.getNumero());
        setBairro(pacienteDTO.getBairro());
        setDdd(pacienteDTO.getDdd());
        setCelular(pacienteDTO.getCelular());
    }

    @JsonCreator
    public Paciente (@JsonProperty("id_paciente") Integer id ) {
        this.id = id;
    }

    public Paciente(int id, String nome, long cpf, String convenio, String cep, String endereco,
                    String numero, String bairro, int ddd,
                    long celular) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.convenio = convenio;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.ddd = ddd;
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return id == paciente.id && cpf == paciente.cpf && convenio == paciente.convenio && ddd == paciente.ddd && celular == paciente.celular && nome.equals(paciente.nome) && cep.equals(paciente.cep) && endereco.equals(paciente.endereco) && numero.equals(paciente.numero) && bairro.equals(paciente.bairro) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, convenio, cep, endereco, numero, bairro, ddd, celular);
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

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", convenio=" + convenio +
                ", cep='" + cep + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", ddd=" + ddd +
                ", celular=" + celular +
                '}';
    }
}
