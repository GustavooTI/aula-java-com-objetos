import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCarrosVendidos;
        double valorTotalVendas, salarioFixo, valorPorCarroVendido, comissao, salarioFinal;

        System.out.print("Digite o número de carros vendidos: ");
        numCarrosVendidos = input.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        valorTotalVendas = input.nextDouble();

        System.out.print("Digite o salário fixo: ");
        salarioFixo = input.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: ");
        valorPorCarroVendido = input.nextDouble();

        comissao = numCarrosVendidos * valorPorCarroVendido;
        salarioFinal = salarioFixo + comissao + (valorTotalVendas * 0.05);

        System.out.println("O salário final do vendedor é: R$" + salarioFinal);
    }
}