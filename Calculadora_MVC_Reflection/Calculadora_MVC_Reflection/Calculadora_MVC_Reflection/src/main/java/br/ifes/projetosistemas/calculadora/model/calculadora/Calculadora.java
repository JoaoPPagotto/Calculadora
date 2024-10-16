package br.ifes.projetosistemas.calculadora.model.calculadora;

import br.ifes.projetosistemas.calculadora.model.fabricas.FabricaAbstrata;
import br.ifes.projetosistemas.calculadora.model.fabricas.IFabricaGeral;
import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.exception.OperacaoInvalidaException;
import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

public class Calculadora implements br.ifes.projetosistemas.calculadora.model.calculadora.ICalculadora {

    public int calculation (IOperation operation, int value1, int value2){

        return operation.calc(value1,value2);
    }

    @Override
    public ResponseDTO calcular (RequestDTO requestDTO) throws OperacaoInvalidaException {

        IFabricaGeral fabricaAbastrata = new FabricaAbstrata();

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
