package br.ifes.projetosistemas.calculadora.model.BuildMenu;

import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;
import br.ifes.projetosistemas.calculadora.model.fabricas.FabricaMenuAbstrata;
import br.ifes.projetosistemas.calculadora.model.fabricas.IFabricaMenu;
import br.ifes.projetosistemas.calculadora.model.operation.IOperation;
import org.reflections.Reflections;

import java.util.ArrayList;

public class BuildMenu implements IBuildMenu{

    @Override
    public ArrayList<String> GetOpcoes() throws OperacaoInvalidaException{

        IFabricaMenu fabricaMenu = new FabricaMenuAbstrata();
        ArrayList<String> ListaOperacoes = new ArrayList<>();

        ListaOperacoes = fabricaMenu.Build();

        return ListaOperacoes;
    }
}
