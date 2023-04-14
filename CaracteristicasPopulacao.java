import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qtdFem18a35CastCast = 0;
        int qtdHab = 0;
        int idade;
        char sexo, corOlhos, corCabelos;
        double salario;

        do {
            System.out.println("Habitante " + (qtdHab + 1));

            do {
                System.out.print("Sexo (m/f): ");
                sexo = input.next().charAt(0);
            } while (sexo != 'm' && sexo != 'f');

            do {
                System.out.print("Cor dos olhos (a/v/c/p): ");
                corOlhos = input.next().charAt(0);
            } while (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p');

            do {
                System.out.print("Cor dos cabelos (l/c/p/r): ");
                corCabelos = input.next().charAt(0);
            } while (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r');

            do {
                System.out.print("Idade (entre 10 e 100 anos, ou -1 para finalizar): ");
                idade = input.nextInt();
            } while (idade != -1 && (idade < 10 || idade > 100));

            if (idade != -1) {
                do {
                    System.out.print("Salário: ");
                    salario = input.nextDouble();
                } while (salario < 0);

                if (sexo == 'f' && idade >= 18 && idade <= 35 && corOlhos == 'c' && corCabelos == 'c') {
                    qtdFem18a35CastCast++;
                }

                qtdHab++;
            }

        } while (idade != -1);

        double porcFem18a35CastCast = (double) qtdFem18a35CastCast / qtdHab * 100;

        System.out.println("\nResultados finais:");
        System.out.println("Quantidade de habitantes cadastrados: " + qtdHab);
        System.out.println("Porcentagem de mulheres entre 18 e 35 anos com olhos castanhos e cabelos castanhos: " + porcFem18a35CastCast + "%");
    }

}