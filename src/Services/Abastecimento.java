package Services;

import java.util.Scanner;

import static Services.Relatorios.*;

public class Abastecimento {
    static Scanner scanner = new Scanner(System.in);
    public static void abastecerVeiculo(){
        double gasolinaComumPreco = 3.49;
        double gasolinaAditivadaPreco = 3.69;
        double etanolPreco = 2.39;
        double dieselPreco = 2.89;

        int opcao;
        System.out.println("""
                1- Gasolina Comum (R$3,49/litro)
                2- Gasolina Aditivada (R$3,69/litro)
                3- Etanol (R$2,39/litro)
                4- Diesel (R$2,89/litro)
                5- Voltar
                Digite o combustível desejado:
                """);

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                if (Tanques.getTanqueGasolinaComum() == 0) {
                    System.out.println("Tanque vazio!!!");
                    abastecerVeiculo();
                }
                double valor;
                System.out.println("Insira o valor a ser abastecido: R$ ");
                valor = scanner.nextDouble();
                double litrosAbastecidos = valor / gasolinaComumPreco;
                if (litrosAbastecidos > Tanques.getTanqueGasolinaComum()) {
                    System.out.println("Não há combustível o suficiente!!!");
                    abastecerVeiculo();
                }
                Tanques.setTanqueGasolinaComum(Tanques.getTanqueGasolinaComum() - litrosAbastecidos);
                System.out.println("Você abasteceu " + litrosAbastecidos + " litros");
                abastecimentoGasolinaComumValor.add(valor);
                abastecimentoGasolinaComumLitros.add(litrosAbastecidos);
                Vendas.menuVendas();
            }
            case 2 -> {
                if (Tanques.getTanqueGasolinaAditivada() == 0) {
                    System.out.println("Tanque vazio!!!");
                    abastecerVeiculo();
                }
                double valor;
                System.out.println("Insira o valor a ser abastecido: R$ ");
                valor = scanner.nextDouble();
                double litrosAbastecidos = valor / gasolinaAditivadaPreco;
                if (litrosAbastecidos > Tanques.getTanqueGasolinaAditivada()) {
                    System.out.println("Não há combustível o suficiente!!!");
                    abastecerVeiculo();
                }
                Tanques.setTanqueGasolinaAditivada(Tanques.getTanqueGasolinaAditivada() - litrosAbastecidos);
                System.out.println("Você abasteceu " + litrosAbastecidos + " litros");
                abastecimentoGasolinaAditivadaValor.add(valor);
                abastecimentoGasolinaAditivadaLitros.add(litrosAbastecidos);
                Vendas.menuVendas();
            }
            case 3 -> {
                if (Tanques.getTanqueEtanol() == 0) {
                    System.out.println("Tanque vazio!!!");
                    abastecerVeiculo();
                }
                double valor;
                System.out.println("Insira o valor a ser abastecido: R$ ");
                valor = scanner.nextDouble();
                double litrosAbastecidos = valor / etanolPreco;
                if (litrosAbastecidos > Tanques.getTanqueEtanol()) {
                    System.out.println("Não há combustível o suficiente!!!");
                    abastecerVeiculo();
                }
                Tanques.setTanqueEtanol(Tanques.getTanqueEtanol() - litrosAbastecidos);
                System.out.println("Você abasteceu " + litrosAbastecidos + " litros");
                abastecimentoEtanolValor.add(valor);
                abastecimentoEtanolLitros.add(litrosAbastecidos);
                Vendas.menuVendas();
            }
            case 4 -> {
                if (Tanques.getTanqueDiesel() == 0) {
                    System.out.println("Tanque vazio!!!");
                    abastecerVeiculo();
                }
                double valor;
                System.out.println("Insira o valor a ser abastecido: R$ ");
                valor = scanner.nextDouble();
                double litrosAbastecidos = valor / dieselPreco;
                if (litrosAbastecidos > Tanques.getTanqueDiesel()) {
                    System.out.println("Não há combustível o suficiente!!!");
                    abastecerVeiculo();
                }
                Tanques.setTanqueDiesel(Tanques.getTanqueDiesel() - litrosAbastecidos);
                System.out.println("Você abasteceu " + litrosAbastecidos + " litros");
                abastecimentoDieselValor.add(valor);
                abastecimentoDieselLitros.add(litrosAbastecidos);
                Vendas.menuVendas();
            }
            case 5 -> Menu.menuPrincipal();
            default -> {
                System.out.println("Opção inválida");
                abastecerVeiculo();
            }
        }
    }
}