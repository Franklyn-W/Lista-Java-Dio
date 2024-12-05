import java.util.Scanner;

public class Exercicio14 {

    /*
     * Faça um algoritmo que receba um valor A e B
     * Troque o valor de A por B e o valor de B por A
     * Imprima na tela os valores.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Valor de B: ");
        int B = scanner.nextInt();

        int C;

        // C > A > B > C

        C = A;
        A = B;
        B = C;

        System.out.println("Novo valor de A: " + A + " Novo valor de B: " + B);

        scanner.close();
    }
}
