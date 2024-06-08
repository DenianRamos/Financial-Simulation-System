package main;
import java.util.ArrayList;
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();

            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            financiamentos.add(financiamento);
        }

        double totalValorImoveis = 0;
        double totalFinanciamentos = 0;

        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            totalValorImoveis += financiamento.getValorImovel();
            totalFinanciamentos += financiamento.calcularTotalPagamento();
            System.out.printf("i. Financiamento %d – valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f.\n", i+1, financiamento.getValorImovel(), financiamento.calcularTotalPagamento());
        }

        System.out.printf("Valor total dos imóveis: R$ %.2f\n", totalValorImoveis);
        System.out.printf("Valor total dos financiamentos: R$ %.2f\n", totalFinanciamentos);
    }
}