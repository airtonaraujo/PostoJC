package Services;

import java.util.Scanner;

public class Vendas {
    static Scanner scanner = new Scanner(System.in);

    public static void menuVendas() {
        System.out.println("""
                \nEscolha a operação desejada:
                
                1 - Abastecimento
                2 - Serviços
                3 - Voltar
                """);
        int opcao;
        do{
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> Abastecimento.abastecerVeiculo();
                case 2 -> PostoServicos.venderServicos();
                case 3 -> Menu.menuPrincipal();
                default -> System.out.println("Opção inválida");
            }

        } while(opcao != 3);
    }
}
