package br.ifes.projetosistemas.calculadora.application;

import br.ifes.projetosistemas.calculadora.controller.CalculadoraController;
import br.ifes.projetosistemas.calculadora.view.Menu;
import br.ifes.projetosistemas.calculadora.controller.CalculadoraController;
import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;

public class Main {
    public static void main(String[] args) throws OperacaoInvalidaException {
        CalculadoraController calculadoraController = new CalculadoraController();

        //Menu.showR();

        Menu menu = new Menu();

        RequestDTO requestDTO = menu.show(calculadoraController.BuildMenu());
        ResponseDTO responseDTO = calculadoraController.calc(requestDTO);
        menu.showResult(responseDTO);
    }
}