package br.com.itau.simulacaosaque.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SaqueService {
    public Map<Integer, Integer> calcularSaque(int valor){
        int[] notas = {100, 50, 20, 5};
        Map<Integer, Integer> resultado = new HashMap<>();

        for (int nota : notas){
            if (valor>=nota){
                int quantidade = valor / nota;
                resultado.put(nota, quantidade);
                valor %= nota;
            }
        }

        if(valor > 0){
            throw new IllegalArgumentException("Valor do saque não pode ser atendido com as notas disponíveis.");
        }
        return resultado;
    }
}
