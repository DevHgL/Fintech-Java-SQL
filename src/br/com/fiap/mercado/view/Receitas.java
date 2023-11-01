package br.com.fiap.mercado.view;

import java.util.Scanner;


public class Receitas {
    public static void main(String[] args) {

        double valor = 0;
        String data;
        String descricao;
        int opcao = 0;

        String menu = """
                1 - Adicionar nova receita.
                2 - Sair.
                """;


        Scanner leitura = new Scanner (System.in);
        while (opcao != 2){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Qual valor deseja adicionar?");
                valor = leitura.nextDouble();
                System.out.println("Descrição da receita: ");
                descricao = leitura.next();
                System.out.println("Data do recebimento:");
                data = leitura.next();
                System.out.println("Recebimento resgistrado com sucesso!");
                System.out.println("Valor: " + valor);
                System.out.println("Descrição: " + descricao);
                System.out.println("Data: " + data);

            } else if (opcao != 2){
                System.out.println("Opção inválida");
            }else {
                System.out.println("Tcha tchau!");
            }
        }

    }
}