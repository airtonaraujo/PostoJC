package Services;

import java.util.Scanner;

import static Services.Relatorios.abastecimentoGasolinaComumLitros;
import static Services.Relatorios.abastecimentoGasolinaComumValor;

public class Abastecimento {
    static Scanner scanner = new Scanner(System.in);
    public static void abastecerVeiculo(){
        int opcao;
        System.out.println("""
                1- Gasolina Comum (R$2,19/litro)
                2- Gasolina Aditivada (R$2,29/litro)
                3- Etanol (R$1,19/litro)
                4- Diesel (R$1,39/litro)
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
                double litrosAbastecidos = valor / Tanques.getValorGasolinaComum();
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
                double litrosAbastecidos = valor / Tanques.getValorGasolinaAditivada();
                if (litrosAbastecidos > Tanques.getTanqueGasolinaAditivada()) {
                    System.out.println("Não há combustível o suficiente!!!");
                    abastecerVeiculo();
                }
                Tanques.setTanqueGasolinaAditivada(Tanques.getTanqueGasolinaAditivada() - litrosAbastecidos);
                System.out.println("Você abasteceu " + litrosAbastecidos + " litros");
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
                double litrosAbastecidos = valor / Tanques.getValorEtanol();
                if (litrosAbastecidos > Tanques.getTanqueEtanol()) {
                    System.out.println("Não há combustível o suficiente!!!");
                    abastecerVeiculo();
                }
                Tanques.setTanqueEtanol(Tanques.getTanqueEtanol() - litrosAbastecidos);
                System.out.println("Você abasteceu " + litrosAbastecidos + " litros");
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
                double litrosAbastecidos = valor / Tanques.getValorDiesel();
                if (litrosAbastecidos > Tanques.getTanqueDiesel()) {
                    System.out.println("Não há combustível o suficiente!!!");
                    abastecerVeiculo();
                }
                Tanques.setTanqueDiesel(Tanques.getTanqueDiesel() - litrosAbastecidos);
                System.out.println("Você abasteceu " + litrosAbastecidos + " litros");
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