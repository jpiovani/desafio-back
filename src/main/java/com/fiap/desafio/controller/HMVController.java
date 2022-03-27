package com.fiap.desafio.controller;


import com.fiap.desafio.domain.Paciente;
import com.fiap.desafio.dto.*;
import com.fiap.desafio.service.HMVService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/hmv/v1")
public class HMVController {

    private HMVService hmvService;

    public HMVController (HMVService hmvService){
        this.hmvService = hmvService;
    }

    @CrossOrigin
    @GetMapping("/sintomas")
    public List<SintomasDTO> getListaSintomas(){
        return hmvService.listarSintomas();
    }

    @CrossOrigin
    @GetMapping("/habitos")
    public List<HabitosDTO> getListaHabitos(){
        return hmvService.listarHabitos();
    }

    @CrossOrigin
    @GetMapping("/exames")
    public List<ExamesDTO> getListaExames(){
        return hmvService.listarExames();
    }

    @CrossOrigin
    @PostMapping(value = "/cadastro/paciente")
    @ResponseStatus(HttpStatus.CREATED)
    public PacienteDTO create(@RequestBody PacienteDTO novo){
        return hmvService.cadastrarPaciente(novo);
    }

    @CrossOrigin
    @PostMapping(value = "/cadastro/funcoesVitais", consumes ={"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public FuncoesVitaisDTO create(@RequestBody FuncoesVitaisDTO novo){

        return hmvService.criarFuncoesVitais(novo);
    }

    @CrossOrigin
    @PostMapping(value = "/cadastro/analiseClinica")
    @ResponseStatus(HttpStatus.CREATED)
    public AnaliseClinicaDTO create(@RequestBody AnaliseClinicaDTO novo){
        return hmvService.criarAnaliseClinica(novo);
    }

    @CrossOrigin
    @GetMapping("/paciente/id")
    public Optional<Paciente> getBuscarId(
            @RequestParam(required = true, value = "id") Integer id){

        return hmvService.buscarId(id);
    }

    @CrossOrigin
    @GetMapping("/paciente")
    public List<PacienteDTO> getConsultaPaciente(){
        return hmvService.listarPacientes();
    }

}
