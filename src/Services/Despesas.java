package Services;

import java.util.ArrayList;
import java.util.List;

public class Despesas {
    static List<Double> despesasGasolinaComumValor = new ArrayList<>();
    static List<Double> despesasGasolinaComumLitros = new ArrayList<>();
    static List<Double> despesasGasolinaAditivadaValor = new ArrayList<>();
    static List<Double> despesasGasolinaAditivadaLitros = new ArrayList<>();
    static List<Double> despesasEtanolValor = new ArrayList<>();
    static List<Double> despesasEtanolLitros = new ArrayList<>();
    static List<Double> despesasDieselValor = new ArrayList<>();
    static List<Double> despesasDieselLitros = new ArrayList<>();

    public static void mostrarRelatorioDasDespesas() {
        System.out.println("Gasolina Comum: " + despesasGasolinaComumValor + " reais e " + despesasGasolinaComumLitros + " litros");
        System.out.println("Gasolina Aditivada: " + despesasGasolinaAditivadaValor + " reais e " + despesasGasolinaAditivadaLitros + " litros");
        System.out.println("Etanol: " + despesasEtanolValor + " reais e " + despesasEtanolLitros + " litros");
        System.out.println("Diesel: " + despesasDieselValor + " reais e " + despesasDieselLitros + " litros");
        GerenciamentoPosto.gerenciarPosto();
    }
}
