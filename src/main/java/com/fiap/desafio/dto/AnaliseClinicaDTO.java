package com.fiap.desafio.dto;

import com.fiap.desafio.domain.AnaliseClinica;
import com.fiap.desafio.domain.Exames;
import com.fiap.desafio.domain.Habitos;
import com.fiap.desafio.domain.Sintomas;

import java.util.Calendar;
import java.util.List;

public class AnaliseClinicaDTO {

    private Calendar dataAnalise;
    private String sintomas;
    private String habitos;
    private String exames;
    private String pacientes;

    public AnaliseClinicaDTO(){

    }

    public AnaliseClinicaDTO(AnaliseClinica analiseClinica){
        setDataAnalise(analiseClinica.getDataAnalise());
        setSintomas(analiseClinica.getSintomas());
        setHabitos(analiseClinica.getHabitos());
        setExames(analiseClinica.getExames());
        setPacientes(analiseClinica.getPacientes());
    }

    public Calendar getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(Calendar dataAnalise) {
        this.dataAnalise = dataAnalise;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames){
        this.exames = exames;
    }

    public String getPacientes() {return pacientes;
    }

    public void setPacientes(String pacientes) {this.pacientes = pacientes;
    }
}
