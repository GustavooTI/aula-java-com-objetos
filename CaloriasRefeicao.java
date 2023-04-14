import java.util.Scanner;

public class CaloriasRefeicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prato, sobremesa, bebida;
        double caloriasPrato = 0, caloriasSobremesa = 0, caloriasBebida = 0, totalCalorias;

        System.out.println("Escolha uma opção de prato:");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        prato = input.nextInt();

        switch (prato) {
            case 1 -> caloriasPrato = 180;
            case 2 -> caloriasPrato = 230;
            case 3 -> caloriasPrato = 250;
            case 4 -> caloriasPrato = 350;
            default -> {
                System.out.println("Opção de prato inválida.");
                System.exit(0);
            }
        }

        System.out.println("Escolha uma opção de sobremesa:");
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete diet");
        System.out.println("3 - Mousse diet");
        System.out.println("4 - Mousse chocolate");
        sobremesa = input.nextInt();

        switch (sobremesa) {
            case 1 -> caloriasSobremesa = 75;
            case 2 -> caloriasSobremesa = 110;
            case 3 -> caloriasSobremesa = 170;
            case 4 -> caloriasSobremesa = 200;
            default -> {
                System.out.println("Opção de sobremesa inválida.");
                System.exit(0);
            }
        }

        System.out.println("Escolha uma opção de bebida:");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante diet");
        bebida = input.nextInt();

        switch (bebida) {
            case 1 -> caloriasBebida = 20;
            case 2 -> caloriasBebida = 70;
            case 3 -> caloriasBebida = 100;
            case 4 -> caloriasBebida = 65;
            default -> {
                System.out.println("Opção de bebida inválida.");
                System.exit(0);
            }
        }

        totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

        System.out.println("A quantidade total de calorias da refeição é: " + totalCalorias);
    }
}
