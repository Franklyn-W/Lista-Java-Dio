import java.util.Scanner;

public class Exercicio17 {

    /*
     * Faça um algoritmo que leia uma temperatura em Fahrenheit
     * Calcule a temperatura correspondente em grau Celsius
     * Imprima na tela as duas temperaturas.
     * Fórmula: C = (5 * ( F-32) / 9)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double tempF = scan.nextDouble();

        double tempC = (5 * (tempF -32) / 9);

        System.out.printf("%.2f° Fahrenheit é equivalente a %.2f° Celsius", tempF, tempC);

        scan.close();
    }
}
