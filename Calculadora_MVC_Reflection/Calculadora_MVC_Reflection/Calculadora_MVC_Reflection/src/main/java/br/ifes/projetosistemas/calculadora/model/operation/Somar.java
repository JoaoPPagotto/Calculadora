package br.ifes.projetosistemas.calculadora.model.operation;

import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

public class Somar implements IOperation {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
