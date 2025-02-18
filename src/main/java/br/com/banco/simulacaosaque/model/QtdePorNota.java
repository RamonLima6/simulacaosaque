package br.com.banco.simulacaosaque.model;

import br.com.banco.simulacaosaque.enums.Notas;

public class QtdePorNota {
    Notas nota;
    int quantidade;

    public QtdePorNota(Notas nota, int quantidade) {
        this.nota = nota;
        this.quantidade = quantidade;
    }
}
