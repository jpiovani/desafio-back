package com.fiap.desafio.service;

import com.fiap.desafio.domain.*;
import com.fiap.desafio.dto.*;
import com.fiap.desafio.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HMVServiceImpl implements HMVService{

    private PacienteRepository pacienteRepository;
    private FuncoesVitaisRepository funcoesVitaisRepository;
    private AnaliseClinicaRepository analiseClinicaRepository;
    private SintomasRepository sintomasRepository;
    private HabitosRepository habitosRepository;
    private ExamesRepository examesRepository;

    public HMVServiceImpl(PacienteRepository pacienteRepository, FuncoesVitaisRepository funcoesVitaisRepository,
                          AnaliseClinicaRepository analiseClinicaRepository, SintomasRepository sintomasRepository,
                          HabitosRepository habitosRepository, ExamesRepository examesRepository){
        this.pacienteRepository = pacienteRepository;
        this.funcoesVitaisRepository = funcoesVitaisRepository;
        this.analiseClinicaRepository = analiseClinicaRepository;
        this.sintomasRepository = sintomasRepository;
        this.habitosRepository = habitosRepository;
        this.examesRepository = examesRepository;
    }

    @Override
    public List<SintomasDTO> listarSintomas() {
        List<Sintomas> lista;
        lista = sintomasRepository.findAll();
        return lista.stream().map(sintomas -> new SintomasDTO(sintomas)).collect(Collectors.toList());
    }

    @Override
    public List<HabitosDTO> listarHabitos() {
        List<Habitos> lista;
        lista = habitosRepository.findAll();
        return lista.stream().map(habitos -> new HabitosDTO(habitos)).collect(Collectors.toList());
    }

    @Override
    public List<ExamesDTO> listarExames() {
        List<Exames> lista;
        lista = examesRepository.findAll();
        return lista.stream().map(exames -> new ExamesDTO(exames)).collect(Collectors.toList());
    }

    @Override
    public PacienteDTO cadastrarPaciente(PacienteDTO novoPaciente) {
        Paciente paciente = new Paciente(novoPaciente);
        Paciente savedPaciente = pacienteRepository.save(paciente);
        return new PacienteDTO(savedPaciente);
    }

    @Override
    public FuncoesVitaisDTO criarFuncoesVitais(FuncoesVitaisDTO novafuncoesVitais) {
        FuncoesVitais funcoesVitais = new FuncoesVitais(novafuncoesVitais);
        FuncoesVitais savedFuncoesVitais = funcoesVitaisRepository.save(funcoesVitais);
        return new FuncoesVitaisDTO(savedFuncoesVitais);
    }

    @Override
    public AnaliseClinicaDTO criarAnaliseClinica(AnaliseClinicaDTO novaAnaliseClinica) {
        AnaliseClinica analiseClinica = new AnaliseClinica(novaAnaliseClinica);
        AnaliseClinica savedAnaliseClinica = analiseClinicaRepository.save(analiseClinica);
        return new AnaliseClinicaDTO(savedAnaliseClinica);
    }

    @Override
    public Optional<Paciente> buscarId (@PathVariable("id") Integer id){
        return pacienteRepository.findById(id);
    }

    @Override
    public List<PacienteDTO> listarPacientes() {
        List<Paciente> lista;
        lista = pacienteRepository.findAll();
        return lista.stream().map(pacientes -> new PacienteDTO(pacientes)).collect(Collectors.toList());
    }
}
