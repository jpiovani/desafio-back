package com.fiap.desafio.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fiap.desafio.dto.FuncoesVitaisDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_funcoes_vitais")
public class FuncoesVitais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_paciente")
    private String pacientes;
    @Column(name = "temperatura")
    private String temperatura;
    @Column(name = "pressao_arterial")
    private String pressaoArterial;
    @Column(name = "batimentos_cardiacos")
    private String batimentosCardiacos;

    public FuncoesVitais(){

    }

    public FuncoesVitais(FuncoesVitaisDTO funcoesVitaisDTO){
        setTemperatura(funcoesVitaisDTO.getTemperatura());
        setBatimentosCardiacos(funcoesVitaisDTO.getBatimentosCardiacos());
        setPressaoArterial(funcoesVitaisDTO.getPressaoArterial());
        setPacientes(funcoesVitaisDTO.getPacientes());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuncoesVitais that = (FuncoesVitais) o;
        return id == that.id && pacientes== that.pacientes && temperatura.equals(that.temperatura) && pressaoArterial.equals(that.pressaoArterial) && batimentosCardiacos.equals(that.batimentosCardiacos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pacientes, temperatura, pressaoArterial, batimentosCardiacos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPacientes() {
        return pacientes;
    }

    public void setPacientes(String pacientes) {
        this.pacientes = pacientes;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(String pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public String getBatimentosCardiacos() {
        return batimentosCardiacos;
    }

    public void setBatimentosCardiacos(String batimentosCardiacos) {
        this.batimentosCardiacos = batimentosCardiacos;
    }

    @Override
    public String toString() {
        return "FuncoesVitais{" +
                "id=" + id +
                ", paciente=" + pacientes +
                ", temperatura='" + temperatura + '\'' +
                ", pressaoArterial='" + pressaoArterial + '\'' +
                ", batimentosCardiacos='" + batimentosCardiacos + '\'' +
                '}';
    }
}