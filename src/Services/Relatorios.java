package Services;

import java.util.ArrayList;
import java.util.List;

import static Services.Lucros.*;
import static Services.PostoServicos.*;

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
        System.out.println("\nO total arrecadado em abastecimento de Gasolina Comum foi: " + exibirTotalDespesasValor(abastecimentoGasolinaComumValor) + " reais");
        System.out.println("Foram vendidos " + exibirTotalDespesasLitros(abastecimentoGasolinaComumLitros) + " litros de Gasolina Comum");

        System.out.println("\nO total arrecadado em abastecimento de Gasolina Aditivada foi: " + exibirTotalDespesasValor(abastecimentoGasolinaAditivadaValor) + " reais");
        System.out.println("Foram vendidos " + exibirTotalDespesasLitros(abastecimentoGasolinaAditivadaLitros) + " litros de Gasolina Comum");

        System.out.println("\nO total arrecadado em abastecimento de Etanol foi: " + exibirTotalDespesasValor(abastecimentoEtanolValor) + " reais");
        System.out.println("Foram vendidos " + exibirTotalDespesasLitros(abastecimentoEtanolLitros) + " litros de Gasolina Comum");

        System.out.println("\nO total arrecadado em abastecimento de Diesel foi: " + exibirTotalDespesasValor(abastecimentoDieselValor) + " reais");
        System.out.println("Foram vendidos " + exibirTotalDespesasLitros(abastecimentoDieselLitros) + " litros de Gasolina Comum");


        System.out.println("\nForam realizados " +servicoDuchaEcologicaQtd + " serivços de Ducha Ecológica.");
        System.out.println("Foi arrecadado " +servicoDuchaEcologicaValor + "reais.");

        System.out.println("\nForam realizados " +servicoTrocaOleoQtd + " serivços de Ducha Ecológica.");
        System.out.println("Foi arrecadado " +servicoTrocaOleoValor + "reais.");

        System.out.println("\nForam realizados " +servicoBalanceamentoQtd + " serivços de Ducha Ecológica.");
        System.out.println("Foi arrecadado " +servicoBalanceamentoValor + "reais.");

        System.out.println("\nForam realizados " +servicoCafezinQtd + " serivços de Ducha Ecológica.");
        System.out.println("Foi arrecadado " +servicoCafezinValor + "reais.");
        GerenciamentoPosto.gerenciarPosto();
    }

    public static void mostrarRelatorioDasDespesas() {
        System.out.println("\nGasolina Comum: " + reabastecimentoGasolinaComumValor + " reais e " + reabastecimentoGasolinaComumLitros + " litros");
        System.out.println("Gasolina Aditivada: " + reabastecimentoGasolinaAditivadaValor + " reais e " + reabastecimentoGasolinaAditivadaLitros + " litros");
        System.out.println("Etanol: " + reabastecimentoEtanolValor + " reais e " + reabastecimentoEtanolLitros + " litros");
        System.out.println("Diesel: " + reabastecimentoDieselValor + " reais e " + reabastecimentoDieselLitros + " litros");

        System.out.println("\nO total em litros de Gasolina Comum: " + exibirTotalDespesasLitros(reabastecimentoGasolinaComumLitros) + "l");
        System.out.println("O total em litros de Gasolina Aditivada: " + exibirTotalDespesasLitros(reabastecimentoGasolinaAditivadaLitros) + "l");
        System.out.println("O total em litros de Etanol: " + exibirTotalDespesasLitros(reabastecimentoEtanolLitros) + "l");
        System.out.println("O total em litros de Diesel: " + exibirTotalDespesasLitros(reabastecimentoDieselLitros) + "l");

        System.out.println("\nO valor total em Gasolina Comum: " + exibirTotalDespesasValor(reabastecimentoGasolinaComumValor) + " reais");
        System.out.println("O valor total em Gasolina Aditivada: " + exibirTotalDespesasValor(reabastecimentoGasolinaAditivadaValor) + " reais");
        System.out.println("O valor total em Gasolina Etanol: " + exibirTotalDespesasValor(reabastecimentoEtanolValor) + " reais");
        System.out.println("O valor total em Gasolina Diesel: " + exibirTotalDespesasValor(reabastecimentoDieselValor) + " reais");
        GerenciamentoPosto.gerenciarPosto();
    }

    static double exibirTotalDespesasValor(List<Double> combustivel) {
        double totalValor = 0;

        for (Double item: combustivel) {
            totalValor += item;
        }
        return totalValor;
    }
    static double exibirTotalDespesasLitros(List<Double> combustivel) {
        double totalLitros = 0;
        for (Double item: combustivel) {
            totalLitros += item;
        }
        return totalLitros;
    }

    public static void mostrarRelatorioDeLucros() {
        System.out.println("\nO lucro bruto com abastecimento de combustível foi de: R$" +exibirLucroBrutoAbastecimento());
        System.out.println("O lucro líquido com abastecimento de combustível foi de: R$" +exibirLucroLiquidoAbastecimento());

        System.out.println("\nO lucro bruto com os serviços do posto foi de: R$" +exibirLucroServicos());

        System.out.println("\nO lucro bruto total do posto é de: " + (exibirLucroBrutoAbastecimento() + exibirLucroServicos()));
        System.out.println("O lucro líquido total do posto é de: " + (exibirLucroLiquidoAbastecimento() + exibirLucroServicos()));
        GerenciamentoPosto.gerenciarPosto();
    }
}
