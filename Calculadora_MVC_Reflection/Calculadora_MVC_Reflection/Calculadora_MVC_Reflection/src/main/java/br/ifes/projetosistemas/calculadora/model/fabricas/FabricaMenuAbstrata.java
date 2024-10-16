package br.ifes.projetosistemas.calculadora.model.fabricas;


import br.ifes.projetosistemas.calculadora.model.operation.IOperation;
import org.reflections.Reflections;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Set;

public class FabricaMenuAbstrata implements IFabricaMenu{

    @Override
    public ArrayList<String> Build(){
        Reflections reflections = new Reflections(this.pacoteBase);
        ArrayList<String> ListaOperacoes = new ArrayList<>();

        // Busca todas as classes que implementam a interface IOperation
        Set<Class<? extends IOperation>> classes = reflections.getSubTypesOf(IOperation.class);

        // Imprime o nome das classes que implementam a interface
        for (Class<? extends IOperation> clazz : classes) {
            ListaOperacoes.add(clazz.getSimpleName());
        }
        return ListaOperacoes;
    }
}
