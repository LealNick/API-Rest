package com.example.demo_gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioAPI {

    @GetMapping("/{funcId}")
    public String getFuncionario(String funcId)
    {
        return"funcionario encontrado";
    }
}