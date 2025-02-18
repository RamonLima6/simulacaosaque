package br.com.banco.simulacaosaque.enums;

public enum Notas {
    NOTA100(100),
    NOTA50(50),
    NOTA20(20),
    NOTA5(5);
    private final int valor;

    Notas(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
}
