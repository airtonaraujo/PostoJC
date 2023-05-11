package Services;

import java.util.Scanner;

public class PostoServicos {
    static Scanner scanner = new Scanner(System.in);
    public static void venderServicos(){
        int opcao;
        System.out.println("""
                1	Ducha Ecológica	8,00
                2	Troca de Óleo	50,00
                3	Balanceamento	35,00
                4	Café	2,00
                5   Voltar
                """);

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> confirmarCompra();

            case 2 -> confirmarCompra();

            case 3 -> confirmarCompra();

            case 4 -> confirmarCompra();

            case 5 -> Vendas.menuVendas();
            default -> {
                System.out.println("Opção inválida");
                venderServicos();
            }
        }
    }

    public static void confirmarCompra() {
        int confirmacao;
        System.out.println("""
                        Para confirmar a compra diga a forma de pagamento:
                        1   Dinheiro
                        2   Cartão
                        3   Voltar
                        """);
        confirmacao = scanner.nextInt();
        switch (confirmacao) {
            case 1 -> System.out.println("Obrigado pela compra. Volte sempre!");
            case 2 -> System.out.println("Obrigado pela compra. Volte sempre!");
            case 3 -> venderServicos();
            default -> {
                System.out.println("Opção inválida");
                confirmarCompra();
            }
        }
    }
}
