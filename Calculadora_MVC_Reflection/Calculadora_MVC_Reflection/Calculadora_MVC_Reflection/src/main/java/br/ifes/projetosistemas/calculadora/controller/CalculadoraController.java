package br.ifes.projetosistemas.calculadora.controller;


import br.ifes.projetosistemas.calculadora.model.BuildMenu.BuildMenu;
import br.ifes.projetosistemas.calculadora.model.BuildMenu.IBuildMenu;
import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.calculadora.Calculadora;
import br.ifes.projetosistemas.calculadora.model.calculadora.ICalculadora;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;

import java.util.ArrayList;

public class CalculadoraController {

    public ResponseDTO calc(RequestDTO requestDTO) throws OperacaoInvalidaException {

        ICalculadora calculadora = new Calculadora();
        return calculadora.calcular(requestDTO);

    }

    public ArrayList<String> BuildMenu() throws OperacaoInvalidaException {

        IBuildMenu buildMenu = new BuildMenu();
        return buildMenu.GetOpcoes();
    }


}
