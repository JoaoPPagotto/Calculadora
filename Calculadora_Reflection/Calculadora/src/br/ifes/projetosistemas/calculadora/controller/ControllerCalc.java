package br.ifes.projetosistemas.calculadora.controller;

import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.Calculadora.Calculadora;
import br.ifes.projetosistemas.calculadora.model.Calculadora.ICalculadora;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;

public class ControllerCalc {

    public ResponseDTO calc(RequestDTO requestDTO) throws OperacaoInvalidaException {

        ICalculadora calculadora = new Calculadora();
        return calculadora.calcular(requestDTO);

    }
}

