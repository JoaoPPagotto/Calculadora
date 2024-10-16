package br.ifes.projetosistemas.calculadora.model.BuildMenu;

import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;

import java.util.ArrayList;

public interface IBuildMenu {

    public ArrayList<String> GetOpcoes() throws OperacaoInvalidaException;
}
