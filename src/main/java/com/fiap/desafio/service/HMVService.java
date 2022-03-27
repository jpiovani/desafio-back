package com.fiap.desafio.service;

import com.fiap.desafio.domain.Paciente;
import com.fiap.desafio.dto.*;

import java.util.List;
import java.util.Optional;

public interface HMVService {

    List<SintomasDTO> listarSintomas ();
    List<HabitosDTO> listarHabitos();
    List<ExamesDTO> listarExames();
    PacienteDTO cadastrarPaciente(PacienteDTO novoPaciente);
    FuncoesVitaisDTO criarFuncoesVitais(FuncoesVitaisDTO novafuncoesVitais);
    AnaliseClinicaDTO criarAnaliseClinica(AnaliseClinicaDTO novaAnaliseClinica);
    Optional<Paciente> buscarId(Integer id);
    List<PacienteDTO> listarPacientes();


}
