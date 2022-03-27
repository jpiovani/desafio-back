package com.fiap.desafio.domain;

import com.fiap.desafio.dto.AnaliseClinicaDTO;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;

@Entity
@Table(name = "tbl_analise_clinica")
public class AnaliseClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_analise_clinica")
    private int id;
    @Column(name = "id_paciente")
    private String pacientes;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_analise")
    private Calendar dataAnalise;
    @Column(name = "tbl_sintomas")
    private String sintomas;
    @Column(name = "tbl_habitos")
    private String habitos;
    @Column(name = "tbl_exames")
    private String exames;

    public AnaliseClinica(){

    }

    public AnaliseClinica(AnaliseClinicaDTO analiseClinicaDTO){
        setDataAnalise(analiseClinicaDTO.getDataAnalise());
        setSintomas(analiseClinicaDTO.getSintomas());
        setHabitos(analiseClinicaDTO.getHabitos());
        setExames(analiseClinicaDTO.getExames());
        setPacientes(analiseClinicaDTO.getPacientes());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnaliseClinica that = (AnaliseClinica) o;
        return id == that.id && pacientes == that.pacientes && dataAnalise.equals(that.dataAnalise) && sintomas.equals(that.sintomas) && habitos.equals(that.habitos) && exames.equals(that.exames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pacientes, dataAnalise, sintomas, habitos, exames);
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

    public void setExames(String exames) {
        this.exames = exames;
    }

    @Override
    public String toString() {
        return "AnaliseClinica{" +
                "id=" + id +
                ", paciente=" + pacientes +
                ", dataAnalise=" + dataAnalise +
                ", sintomas=" + sintomas +
                ", habitos=" + habitos +
                ", exames=" + exames +
                '}';
    }
}
