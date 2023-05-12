package Services;

import java.util.Scanner;

public class PostoServicos {
    static Scanner scanner = new Scanner(System.in);

    static int servicoDuchaEcologicaQtd;
    static int servicoTrocaOleoQtd;
    static int servicoBalanceamentoQtd;
    static int servicoCafezinQtd;

    static double servicoDuchaEcologicaValor;
    static double servicoTrocaOleoValor;
    static double servicoBalanceamentoValor;
    static double servicoCafezinValor;

    public static void venderServicos() {
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
            case 1 -> {
                int confirmacao;
                System.out.println("""
                        Para confirmar a compra diga a forma de pagamento:
                        1   Dinheiro
                        2   Cartão
                        3   Voltar
                        """);
                confirmacao = scanner.nextInt();
                switch (confirmacao) {
                    case 1, 2 -> {
                        System.out.println("Obrigado pela compra. Volte sempre!");
                        servicoDuchaEcologicaQtd++;
                        servicoDuchaEcologicaValor += 8;
                        venderServicos();
                    }
                    case 3 -> venderServicos();
                    default -> System.out.println("Opção inválida");
                }
            }

            case 2 -> {
                int confirmacao;
                System.out.println("""
                        Para confirmar a compra diga a forma de pagamento:
                        1   Dinheiro
                        2   Cartão
                        3   Voltar
                        """);
                confirmacao = scanner.nextInt();
                switch (confirmacao) {
                    case 1, 2 -> {
                        System.out.println("Obrigado pela compra. Volte sempre!");
                        servicoTrocaOleoQtd++;
                        servicoTrocaOleoValor += 50;
                        venderServicos();
                    }
                    case 3 -> venderServicos();
                    default -> System.out.println("Opção inválida");
                }
            }

            case 3 -> {
                int confirmacao;
                System.out.println("""
                        Para confirmar a compra diga a forma de pagamento:
                        1   Dinheiro
                        2   Cartão
                        3   Voltar
                        """);
                confirmacao = scanner.nextInt();
                switch (confirmacao) {
                    case 1, 2 -> {
                        System.out.println("Obrigado pela compra. Volte sempre!");
                        servicoBalanceamentoQtd++;
                        servicoBalanceamentoValor += 35;
                        venderServicos();
                    }
                    case 3 -> venderServicos();
                    default -> System.out.println("Opção inválida");
                }
            }

            case 4 -> {
                int confirmacao;
                System.out.println("""
                        Para confirmar a compra diga a forma de pagamento:
                        1   Dinheiro
                        2   Cartão
                        3   Voltar
                        """);
                confirmacao = scanner.nextInt();
                switch (confirmacao) {
                    case 1, 2 -> {
                        System.out.println("Obrigado pela compra. Volte sempre!");
                        servicoCafezinQtd++;
                        servicoCafezinValor += 2;
                        venderServicos();
                    }
                    case 3 -> venderServicos();
                    default -> System.out.println("Opção inválida");
                }
            }
            case 5 -> Vendas.menuVendas();
            default -> {
                System.out.println("Opção inválida");
                venderServicos();
            }

        }


    }
}
