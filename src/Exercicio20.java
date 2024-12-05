import java.util.Scanner;

public class Exercicio20 {
    /*
     * Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o numéro base da tabuada: ");
        int numeroBase = scan.nextInt();

        System.out.println("Calculando a tabuada de " + numeroBase);
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", numeroBase, i, (numeroBase * i));
        }

        scan.close();



    }
}
