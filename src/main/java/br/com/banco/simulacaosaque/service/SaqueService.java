package br.com.banco.simulacaosaque.service;

import br.com.banco.simulacaosaque.enums.Notas;
import br.com.banco.simulacaosaque.model.QtdePorNota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaqueService {

    public List<QtdePorNota> calcularSaque(int valor){
        List<QtdePorNota> resultado = new ArrayList<>();

        for(Notas nota : Notas.values()){
            if(valor>nota.getValor()){
                int quantidade = valor/nota.getValor();
                resultado.add(new QtdePorNota(nota, quantidade));
                valor-=nota.getValor()*quantidade;
            }
        }
        return resultado;
    }
}
