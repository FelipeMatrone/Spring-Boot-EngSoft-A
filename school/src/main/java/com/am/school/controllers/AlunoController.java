package com.am.school.controllers;

import com.am.school.models.AlunoModel;
import com.am.school.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")

public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoModel criarAluno( @RequestBody AlunoModel alunoModel){
        return alunoService.criarAluno(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> buscarTodosAlunos(){
        return alunoService.buscarTodosAlunos();
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id ){
        alunoService.deletarAluno(id);
    }
}
