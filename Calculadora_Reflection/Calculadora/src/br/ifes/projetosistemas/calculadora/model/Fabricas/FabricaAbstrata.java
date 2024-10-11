package br.ifes.projetosistemas.calculadora.model.Fabricas;

import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;
import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

import java.lang.reflect.InvocationTargetException;

public class FabricaAbstrata<T> implements IFabrica<IOperation>{

    @Override
    public IOperation criar(String opcao) throws OperacaoInvalidaException {
        try{
            String pacoteBase = this.pacoteBase + opcao;

            IOperation operation = null;

            Class<?> classe = Class.forName("br.ifes.projetosistemas.calculadora.model.operation." + opcao);
            operation = (IOperation) classe.getDeclaredConstructor().newInstance();

            return operation;

        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                InvocationTargetException e){
            throw new OperacaoInvalidaException();
        }
    }
}
