package br.ifes.projetosistemas.calculadora.model.Fabricas;

import br.ifes.projetosistemas.calculadora.model.Calculadora.ICalculadora;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;

public interface IFabrica<T> {
    String pacoteBase = "br.ifes.projetosistemas.calculadora.model.operation.";
    T criar(String opcao) throws OperacaoInvalidaException;
}
