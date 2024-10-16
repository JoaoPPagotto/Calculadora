package br.ifes.projetosistemas.calculadora.model.fabricas;

import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;

public interface IFabricaGeral<T> {
    String pacoteBase = "br.ifes.projetosistemas.calculadora.model.operation.";
    T criar(String opcao) throws OperacaoInvalidaException;
}
