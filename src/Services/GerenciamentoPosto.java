package Services;

import java.util.Scanner;

public class GerenciamentoPosto {
    static Scanner scanner = new Scanner(System.in);

    public static void gerenciarPosto() {
        System.out.println("""
                \nEscolha a operação desejada:
                
                1 - Abastecimento dos Tanques;
                2 - Relatório dos Tanques;
                3 - Relatório de Vendas;
                4 - Relatório de Despesas;
                5 - Relatório de Lucros;
                6 - Voltar
                """);

        int opcao;
        do{
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> Tanques.abastecerTanques();
                case 2 -> Tanques.mostrarRelatorioDosTanques();
                case 3 -> Vendas.mostrarRelatorioDasVendas();
                case 4 -> Despesas.mostrarRelatorioDasDespesas();
                case 5 -> Vendas.mostrarRelatorioDeLucros();
                case 6 -> Menu.menuPrincipal();
                default -> System.out.println("Opção inválida");
            }

        } while(opcao != 0);
    }
}
