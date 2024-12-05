import java.util.Scanner;

public class Exercicio6 {

    /*
     * Faça um algoritmo que leia um valor qualquer e imprima na tela com um
     * reajuste de 5%.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextDouble();

        System.out.println(numero * 1.05);

        scanner.close();

    }
}
