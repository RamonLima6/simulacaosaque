package br.com.banco.simulacaosaque.controller;

import br.com.banco.simulacaosaque.model.QtdePorNota;
import br.com.banco.simulacaosaque.service.SaqueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaqueController {

    SaqueService saqueService;

    public SaqueController(SaqueService saqueService) {
        this.saqueService = saqueService;
    }

    @GetMapping("/saque")
    public List<QtdePorNota> calcularSaque(@RequestParam int valor){
        return saqueService.calcularSaque(valor);
    }
}
