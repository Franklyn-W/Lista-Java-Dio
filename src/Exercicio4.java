import java.util.Scanner;

public class Exercicio4 {

    /*
     * Faça um algoritmo que receba um número inteiro.
     * Imprima na tela o seu antecessor e o seu sucessor.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        System.out.println("Antecessor: " + (numero - 1) + ", Sucessor: " + (numero + 1));

        scanner.close();

    }
}
