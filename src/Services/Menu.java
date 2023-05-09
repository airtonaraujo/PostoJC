package Services;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
        int opcao;
        do{
            System.out.println("""
                Escolha a operação desejada:
                
                1- Gerenciamento do posto
                2- Vendas
                3- Sair
                """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> GerenciamentoPosto.gerenciarPosto();
                case 2 -> venderServicos();
                case 3 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        } while(true);
    }

    public static void venderServicos() {
        Vendas.menuVendas();
    }
}
