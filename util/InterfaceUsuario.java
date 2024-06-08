package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valor;
        do {
            System.out.println("Digite o valor do imóvel:");
            valor = scanner.nextDouble();
            scanner.nextLine();
            if (valor <= 0) {
                System.out.println("O valor do imóvel deve ser positivo. Tente novamente.");
            }
        } while (valor <= 0);
        return valor;
    }
    
    

    public int pedirPrazoFinanciamento() {
        int prazo;
        do {
            System.out.println("Digite o prazo do financiamento em anos:");
            prazo = scanner.nextInt();
            scanner.nextLine();
            if (prazo <= 0) {
                System.out.println("O prazo do financiamento deve ser positivo. Tente novamente.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double pedirTaxaJuros() {
        double taxa;
        do {
            System.out.println("Digite a taxa de juros anual:");
            taxa = scanner.nextDouble();
            scanner.nextLine();
            if (taxa <= 0 || taxa > 100) {
                System.out.println("A taxa de juros deve ser positiva e menor que 100. Tente novamente.");
            }
        } while (taxa <= 0 || taxa > 100);
        return taxa;
    }
}