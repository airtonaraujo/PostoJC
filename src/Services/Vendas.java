package Services;

import java.util.Scanner;

import static Services.Despesas.*;

public class Vendas {

    private static int lucroLiquido;
    private static int lucroBruto;

    public static void mostrarRelatorioDasVendas() {
    }



    public static void mostrarRelatorioDeLucros() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int lucro = 1+1;
        System.out.println(lucro);
        System.out.println("\n");
        lucroBruto += lucro;
        System.out.println(getLucroBruto());

        do  {
            System.out.println("1- Voltar");
            opcao = scanner.nextInt();
        } while (opcao != 1);

        if (opcao == 1) {
            GerenciamentoPosto.gerenciarPosto();
        }
    }

    public int getLucroLiquido() {
        return lucroLiquido;
    }

    public void setLucroLiquido(int lucroLiquido) {
        this.lucroLiquido = lucroLiquido;
    }

    public static int getLucroBruto() {
        return lucroBruto;
    }

    public void setLucroBruto(int lucroBruto) {
        this.lucroBruto = lucroBruto;
    }
}
