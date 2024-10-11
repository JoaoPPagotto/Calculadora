package br.ifes.projetosistemas.calculadora.application;

import br.ifes.projetosistemas.calculadora.controller.ControllerCalc;
import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;
import br.ifes.projetosistemas.calculadora.view.Menu;

public class Application {
    public static void main(String[] args) throws OperacaoInvalidaException {
        Menu menu = new Menu();
        RequestDTO requestDTO = menu.show();
        ControllerCalc controllerCalc = new ControllerCalc();
        ResponseDTO responseDTO = controllerCalc.calc(requestDTO);
        menu.showResult(responseDTO);


    }
}
