package br.ifes.projetosistemas.calculadora.model.calculadora;

import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;
import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

public interface ICalculadora {

    public int calculation (IOperation operation, int value1, int value2);

    public ResponseDTO calcular (RequestDTO requestDTO) throws OperacaoInvalidaException;
}
