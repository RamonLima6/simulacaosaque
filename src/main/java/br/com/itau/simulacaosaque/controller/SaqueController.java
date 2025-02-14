package br.com.itau.simulacaosaque.controller;

import br.com.itau.simulacaosaque.service.SaqueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SaqueController {

    SaqueService saqueService;

    public SaqueController(SaqueService saqueService) {
        this.saqueService = saqueService;
    }

    @GetMapping("/saque")
    public Map<Integer, Integer> calcularSaque(@RequestParam int valor){
        return saqueService.calcularSaque(valor);
    }
}
