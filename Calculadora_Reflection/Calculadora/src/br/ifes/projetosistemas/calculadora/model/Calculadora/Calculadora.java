package br.ifes.projetosistemas.calculadora.model.Calculadora;

import br.ifes.projetosistemas.calculadora.model.Fabricas.FabricaAbstrata;
import br.ifes.projetosistemas.calculadora.model.Fabricas.IFabrica;
import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;
import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

public class Calculadora implements ICalculadora {

    public int calculation (IOperation operation, int value1, int value2){

        return operation.calc(value1,value2);
    }

    @Override
    public ResponseDTO calcular (RequestDTO requestDTO) throws OperacaoInvalidaException {

        IFabrica fabricaAbastrata = new FabricaAbstrata();

        IOperation operacao = (IOperation) fabricaAbastrata.criar(requestDTO.getOpcao());

        int value1 = requestDTO.getValor1();
        int value2 = requestDTO.getValor2();
        int result = -1;

        if(operacao != null){
            result = operacao.calc(value1,value2);
        }

        return new ResponseDTO(result);
    }

}
