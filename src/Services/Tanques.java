package Services;
import java.util.Scanner;

import static Services.Despesas.*;

public class Tanques {
    static Scanner scanner = new Scanner(System.in);
    private static double tanqueGasolinaComum;
    private static double tanqueGasolinaAditivada;
    private static double tanqueEtanol;
    private static double tanqueDiesel;


    public static void mostrarRelatorioDosTanques() {
        System.out.println("Tanque de Gasolina Comum: " + getTanqueGasolinaComum() + " litros");
        System.out.println("Tanque de Gasolina Aditivada: " + getTanqueGasolinaAditivada() + " litros");
        System.out.println("Tanque de Etanol: " + getTanqueEtanol() + " litros");
        System.out.println("Tanque de Diesel: " + getTanqueDiesel() + " litros");
        GerenciamentoPosto.gerenciarPosto();
    }

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
                case 2 -> {
                    System.out.println(abastecerTanqueGasolinaAditivada());
                    GerenciamentoPosto.gerenciarPosto();
                }
                case 3 -> {
                    System.out.println(abastecerTanqueEtanol());
                    GerenciamentoPosto.gerenciarPosto();
                }
                case 4 -> {
                    System.out.println(abastecerTanqueDiesel());
                    GerenciamentoPosto.gerenciarPosto();
                }

                case 5 -> GerenciamentoPosto.gerenciarPosto();
                default -> System.out.println("Opção inválida");
        }
    } while (opcao != 5);

    }

    public static String abastecerTanqueGasolinaComum() {
        double valorAbastecido;
        double litrosAAbastecer;

        System.out.println("""
                Digite a quantidade de litros a abastecer:
                """);
        litrosAAbastecer = scanner.nextInt();
        valorAbastecido = litrosAAbastecer * getValorGasolinaComum();

        if (litrosAAbastecer >= 1 && litrosAAbastecer < 20000) {

            if ((tanqueGasolinaComum + litrosAAbastecer) < 20000) {
                setTanqueGasolinaComum(getTanqueGasolinaComum() + litrosAAbastecer);
                despesasGasolinaComumValor.add(valorAbastecido);
                despesasGasolinaComumLitros.add(litrosAAbastecer);
            } else {
                System.out.println("O valor excede a capacidade do tanque");
            }
        } else {
            System.out.println("A capacidade máxima de cada tanque é de 20000 litros. Insira um valor entre 1 e 20000");
        }
        return "\nObrigado por usar os nossos serviços";
    }

    public static String abastecerTanqueGasolinaAditivada() {
        double valorAbastecido;
        double litrosAAbastecer;

        System.out.println("""
                Digite a quantidade de litros a abastecer:
                """);
        litrosAAbastecer = scanner.nextInt();
        valorAbastecido = litrosAAbastecer * getValorGasolinaAditivada();

        if (litrosAAbastecer >= 1 && litrosAAbastecer < 20000) {

            if ((tanqueGasolinaAditivada + litrosAAbastecer) < 20000) {
                setTanqueGasolinaAditivada(getTanqueGasolinaAditivada() + litrosAAbastecer);
                despesasGasolinaAditivadaValor.add(valorAbastecido);
                despesasGasolinaAditivadaLitros.add(litrosAAbastecer);
            } else {
                System.out.println("O valor excede a capacidade do tanque");
            }
        } else {
            System.out.println("A capacidade máxima de cada tanque é de 20000 litros. Insira um valor entre 1 e 20000");
        }
        return "\nObrigado por usar os nossos serviços";
    }

    public static String abastecerTanqueEtanol() {
        double valorAbastecido;
        double litrosAAbastecer;

        System.out.println("""
                Digite a quantidade de litros a abastecer:
                """);
        litrosAAbastecer = scanner.nextInt();
        valorAbastecido = litrosAAbastecer * getValorEtanol();

        if (litrosAAbastecer >= 1 && litrosAAbastecer < 20000) {

            if ((tanqueEtanol + litrosAAbastecer) < 20000) {
                setTanqueEtanol(getTanqueEtanol() + litrosAAbastecer);
                despesasEtanolValor.add(valorAbastecido);
                despesasEtanolLitros.add(litrosAAbastecer);
            } else {
                System.out.println("O valor excede a capacidade do tanque");
            }
        } else {
            System.out.println("A capacidade máxima de cada tanque é de 20000 litros. Insira um valor entre 1 e 20000");
        }
        return "\nObrigado por usar os nossos serviços";
    }

    public static String abastecerTanqueDiesel() {
        double valorAbastecido;
        double litrosAAbastecer;

        System.out.println("""
                Digite a quantidade de litros a abastecer:
                """);
        litrosAAbastecer = scanner.nextInt();
        valorAbastecido = litrosAAbastecer * getValorDiesel();

        if (litrosAAbastecer >= 1 && litrosAAbastecer < 20000) {

            if ((tanqueDiesel + litrosAAbastecer) < 20000) {
                setTanqueDiesel(getTanqueDiesel() + litrosAAbastecer);
                despesasDieselValor.add(valorAbastecido);
                despesasDieselLitros.add(litrosAAbastecer);
            } else {
                System.out.println("O valor excede a capacidade do tanque");
            }
        } else {
            System.out.println("A capacidade máxima de cada tanque é de 20000 litros. Insira um valor entre 1 e 20000");
        }
        return "\nObrigado por usar os nossos serviços";
    }

    // Getters and Setters

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
        return 2.19;
    }

    public static double getValorGasolinaAditivada() {
        return 2.29;
    }

    public static double getValorEtanol() {
        return 1.19;
    }

    public static double getValorDiesel() {
        return 1.39;
    }
}
