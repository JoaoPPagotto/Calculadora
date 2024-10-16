package br.ifes.projetosistemas.calculadora.model.fabricas;

import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;

import java.util.ArrayList;

public interface IFabricaMenu {
    String pacoteBase = "br.ifes.projetosistemas.calculadora.model.operation.";

    ArrayList<String> Build() throws OperacaoInvalidaException;
}
