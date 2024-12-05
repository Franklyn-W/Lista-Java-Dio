import java.util.Scanner;

public class Exercicio1 {

    /*
     * Faça um algoritmo que leia os valores de A, B, C
     * Em seguida imprima na tela a soma entre A e B
     * E mostre se a soma é menor que C.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double AValue = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double BValue = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double CValue = scanner.nextDouble();

        double soma = AValue + BValue;

        System.out.println("O resultado da soma de A e B é igual a: " + (AValue + BValue));

        if (soma > CValue) {
            System.out.println("O resultado da soma é maior que C");
        } else if (soma == CValue) {
            System.out.println("O resultado da soma é igual a C");
        } else {
            System.out.println("O resultado da soma é menor que C");
        }

        scanner.close();

    }
}
