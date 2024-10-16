package br.ifes.projetosistemas.calculadora.view;
import br.ifes.projetosistemas.calculadora.model.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.model.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.operation.IOperation;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Menu {

    public static ArrayList<String> showR(){
        System.out.println("---->Olá<----");
        Reflections reflections = new Reflections("br.ifes.projetosistemas.calculadora.model.operation"); // Substitua pelo seu pacote
        ArrayList<String> ListaOperacoes = new ArrayList<>();

        // Busca todas as classes que implementam a interface IOperation
        Set<Class<? extends IOperation>> classes = reflections.getSubTypesOf(IOperation.class);

        // Imprime o nome das classes que implementam a interface
        for (Class<? extends IOperation> clazz : classes) {
            System.out.println("Classe que implementa IOperation: " + clazz.getSimpleName());
            ListaOperacoes.add(clazz.getSimpleName());
        }
        return ListaOperacoes;
    }

    public RequestDTO show(ArrayList<String> ListaOpcoes){
        this.showMenuReflection(ListaOpcoes);
        return this.captureValues();
    }

    private RequestDTO captureValues (){

        Scanner input = new Scanner(System.in);
        String opcao = input.nextLine();
        System.out.println("Informe o primeiro valor:");
        int valor1 = input.nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = input.nextInt();

        return new RequestDTO(opcao,valor1,valor2);
    }

    private void showMenu(){

        System.out.println("---->Olá<----");
        System.out.println("Escolha uma das opção:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Vá embora ...");

    }

    private void showMenuReflection(ArrayList<String> listaOpcoes){
        System.out.println("=== ESSAS SÃO AS OPÇÕES DE OPERAÇÕES DISPONÍVEIS ===");
        for (String str : listaOpcoes) {
            System.out.println("- "+str);
        }
    }



    public void showResult (ResponseDTO responseDTO){
        System.out.println("O Resultado é: "+responseDTO.getResult());
    }
}
