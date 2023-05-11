package Services;

import java.util.ArrayList;
import java.util.List;

public class Relatorios {
    static List<Double> reabastecimentoGasolinaComumValor = new ArrayList<>();
    static List<Double> reabastecimentoGasolinaComumLitros = new ArrayList<>();
    static List<Double> reabastecimentoGasolinaAditivadaValor = new ArrayList<>();
    static List<Double> reabastecimentoGasolinaAditivadaLitros = new ArrayList<>();
    static List<Double> reabastecimentoEtanolValor = new ArrayList<>();
    static List<Double> reabastecimentoEtanolLitros = new ArrayList<>();
    static List<Double> reabastecimentoDieselValor = new ArrayList<>();
    static List<Double> reabastecimentoDieselLitros = new ArrayList<>();


    static List<Double> abastecimentoGasolinaComumValor = new ArrayList<>();
    static List<Double> abastecimentoGasolinaComumLitros = new ArrayList<>();
    static List<Double> abastecimentoGasolinaAditivadaValor = new ArrayList<>();
    static List<Double> abastecimentoGasolinaAditivadaLitros = new ArrayList<>();
    static List<Double> abastecimentoEtanolValor = new ArrayList<>();
    static List<Double> abastecimentoEtanolLitros = new ArrayList<>();
    static List<Double> abastecimentoDieselValor = new ArrayList<>();
    static List<Double> abastecimentoDieselLitros = new ArrayList<>();

    public static void mostrarRelatorioDasVendas() {
        System.out.println("\nO total arrecadado em abastecimento de Gasolina Comum foi: " +totalDespesasValor(abastecimentoGasolinaComumValor) + " reais");
        System.out.println("Foram vendidos " +totalDespesasValor(abastecimentoGasolinaComumLitros) + " litros de Gasolina Comum");

        System.out.println("\nO total arrecadado em abastecimento de Gasolina Aditivada foi: " +totalDespesasValor(abastecimentoGasolinaAditivadaValor) + " reais");
        System.out.println("Foram vendidos " +totalDespesasValor(abastecimentoGasolinaAditivadaLitros) + " litros de Gasolina Comum");

        System.out.println("\nO total arrecadado em abastecimento de Etanol foi: " +totalDespesasValor(abastecimentoEtanolValor) + " reais");
        System.out.println("Foram vendidos " +totalDespesasValor(abastecimentoEtanolLitros) + " litros de Gasolina Comum");

        System.out.println("\nO total arrecadado em abastecimento de Diesel foi: " +totalDespesasValor(abastecimentoDieselValor) + " reais");
        System.out.println("Foram vendidos " +totalDespesasValor(abastecimentoDieselLitros) + " litros de Gasolina Comum");
    }

    public static void mostrarRelatorioDasDespesas() {
        System.out.println("\nGasolina Comum: " + reabastecimentoGasolinaComumValor + " reais e " + reabastecimentoGasolinaComumLitros + " litros");
        System.out.println("Gasolina Aditivada: " + reabastecimentoGasolinaAditivadaValor + " reais e " + reabastecimentoGasolinaAditivadaLitros + " litros");
        System.out.println("Etanol: " + reabastecimentoEtanolValor + " reais e " + reabastecimentoEtanolLitros + " litros");
        System.out.println("Diesel: " + reabastecimentoDieselValor + " reais e " + reabastecimentoDieselLitros + " litros");

        System.out.println("\nO total em litros de Gasolina Comum: " +totalDespesasLitros(reabastecimentoGasolinaComumLitros) + "l");
        System.out.println("O total em litros de Gasolina Aditivada: " +totalDespesasLitros(reabastecimentoGasolinaAditivadaLitros) + "l");
        System.out.println("O total em litros de Etanol: " +totalDespesasLitros(reabastecimentoEtanolLitros) + "l");
        System.out.println("O total em litros de Diesel: " +totalDespesasLitros(reabastecimentoDieselLitros) + "l");

        System.out.println("\nO valor total em Gasolina Comum: " +totalDespesasValor(reabastecimentoGasolinaComumValor) + " reais");
        System.out.println("O valor total em Gasolina Aditivada: " +totalDespesasValor(reabastecimentoGasolinaAditivadaValor) + " reais");
        System.out.println("O valor total em Gasolina Etanol: " +totalDespesasValor(reabastecimentoEtanolValor) + " reais");
        System.out.println("O valor total em Gasolina Diesel: " +totalDespesasValor(reabastecimentoDieselValor) + " reais");
        GerenciamentoPosto.gerenciarPosto();
    }

    private static double totalDespesasValor(List<Double> combustivel) {
        double totalValor = 0;

        for (Double item: combustivel) {
            totalValor += item;
        }
        return totalValor;
    }
    private static double totalDespesasLitros(List<Double> combustivel) {
        double totalLitros = 0;
        for (Double item: combustivel) {
            totalLitros += item;
        }
        return totalLitros;
    }

    public static void mostrarRelatorioDeLucros() {
        System.out.println("\nNao ta pronto ué, eu falei");
        GerenciamentoPosto.gerenciarPosto();
    }
}
