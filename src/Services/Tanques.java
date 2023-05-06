package Services;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tanques {
    static Scanner scanner = new Scanner(System.in);
    private static double tanqueGasolinaComum;
    private static double tanqueGasolinaAditivada;
    private static double tanqueEtanol;
    private static double tanqueDiesel;

    private static double valorGasolinaComum = 2.19;

    public static void abastecerTanques() {
        int opcao;
        do {
            System.out.println("""
                    Escolha qual tanque deseja abastecer:
                    1- Gasolina Comum (R$2,19/litro)
                    2- Gasolina Aditivada (R$2,29/litro)
                    3- Etanol (R$1,19/litro)
                    4- Diesel (R$1,39/litro)
                    5- Voltar
                    """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println(abastecerTanqueGasolinaComum());
                    GerenciamentoPosto.gerenciarPosto();
                }
                /*case 2 -> abastecerTanqueGasolinaAditivada();
                case 3 -> abastecerTanqueEtanol();
                case 4 -> abastecerTanqueDiesel();*/

                case 5 -> GerenciamentoPosto.gerenciarPosto();
                default -> System.out.println("Opção inválida");
        }
    } while (opcao != 5);

    }

    public static String abastecerTanqueGasolinaComum() {
        double valorAAbastecer;
        double valorAbastecido = 0;

        System.out.println("""
                Digite a quantidade de litros a abastecer: 
                """);
        valorAAbastecer = scanner.nextInt();

        valorAbastecido += (valorAAbastecer * getValorGasolinaComum());

        if (tanqueGasolinaComum < 20000) {
            setTanqueGasolinaComum(getTanqueGasolinaComum() + valorAbastecido);
        } else {
            System.out.println("insira um valor válido");
        }
        return "Você abasteceu " + valorAbastecido + " e a capacidade do tanque está em: " +getTanqueGasolinaComum() + " litros";
    }

    // Getters and Setters

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Tanques.scanner = scanner;
    }

    public static double getTanqueGasolinaComum() {
        return tanqueGasolinaComum;
    }

    public static void setTanqueGasolinaComum(double tanqueGasolinaComum) {
        Tanques.tanqueGasolinaComum = tanqueGasolinaComum;
    }

    public static double getTanqueGasolinaAditivada() {
        return tanqueGasolinaAditivada;
    }

    public static void setTanqueGasolinaAditivada(double tanqueGasolinaAditivada) {
        Tanques.tanqueGasolinaAditivada = tanqueGasolinaAditivada;
    }

    public static double getTanqueEtanol() {
        return tanqueEtanol;
    }

    public static void setTanqueEtanol(double tanqueEtanol) {
        Tanques.tanqueEtanol = tanqueEtanol;
    }

    public static double getTanqueDiesel() {
        return tanqueDiesel;
    }

    public static void setTanqueDiesel(double tanqueDiesel) {
        Tanques.tanqueDiesel = tanqueDiesel;
    }

    public static double getValorGasolinaComum() {
        return valorGasolinaComum;
    }
}
