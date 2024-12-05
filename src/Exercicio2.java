import java.util.Scanner;

public class Exercicio2 {

    /*
     * Faça um algoritmo para receber um número qualquer
     * Imprimir na tela se o número é par ou ímpar, positivo ou negativo.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        System.out.println((numero % 2 == 0 ? "Par" : "Impar"));

        System.out.println((numero >= 0 ? "Positivo" : "Negativo"));

        scan.close();

    }
}
