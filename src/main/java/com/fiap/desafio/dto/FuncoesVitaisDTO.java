package com.fiap.desafio.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fiap.desafio.domain.FuncoesVitais;
import com.fiap.desafio.domain.Paciente;

public class FuncoesVitaisDTO {

    private String temperatura;
    private String pressaoArterial;
    private String batimentosCardiacos;
    private String pacientes;

    public FuncoesVitaisDTO(){

    }

    public FuncoesVitaisDTO(FuncoesVitais funcoesVitais){
        setTemperatura(funcoesVitais.getTemperatura());
        setPressaoArterial(funcoesVitais.getPressaoArterial());
        setBatimentosCardiacos(funcoesVitais.getBatimentosCardiacos());
        setPacientes(funcoesVitais.getPacientes());
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

    public String getPacientes() {return pacientes;}

    public void setPacientes(String pacientes) {this.pacientes = pacientes;}
}
