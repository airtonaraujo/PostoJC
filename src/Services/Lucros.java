package Services;

import static Services.PostoServicos.*;
import static Services.Relatorios.*;

public class Lucros {
    public static double exibirLucroBrutoAbastecimento() {
        double lucroBruto = 0;
        lucroBruto += exibirTotalDespesasValor(abastecimentoGasolinaComumValor);
        lucroBruto += exibirTotalDespesasValor(abastecimentoGasolinaAditivadaValor);
        lucroBruto += exibirTotalDespesasValor(abastecimentoEtanolValor);
        lucroBruto += exibirTotalDespesasValor(abastecimentoDieselValor);
        return lucroBruto;
    }

    public static double exibirLucroLiquidoAbastecimento() {
        double custoReabastecimento = 0;
        custoReabastecimento += exibirTotalDespesasValor(reabastecimentoGasolinaComumValor);
        custoReabastecimento += exibirTotalDespesasValor(reabastecimentoGasolinaAditivadaValor);
        custoReabastecimento += exibirTotalDespesasValor(reabastecimentoEtanolValor);
        custoReabastecimento += exibirTotalDespesasValor(reabastecimentoDieselValor);

        return custoReabastecimento - exibirLucroBrutoAbastecimento();
    }

    public static double exibirLucroServicos() {
        double lucroBrutoServicos = 0;
        lucroBrutoServicos += servicoDuchaEcologicaValor;
        lucroBrutoServicos += servicoTrocaOleoValor;
        lucroBrutoServicos += servicoBalanceamentoValor;
        lucroBrutoServicos += servicoCafezinValor;

        return lucroBrutoServicos;
    }
}
