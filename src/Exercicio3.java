import java.util.Scanner;

public class Exercicio3 {
    /*
     * Faça um algoritmo que leia dois valores inteiros A e B,
     * Se os valores de A e B forem iguais, deverá somar os dois valores, caso
     * contrário devera multiplicar A por B.
     * Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma
     * variável C e imprimir seu valor na tela.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroA = scanner.nextInt();

        int numeroB = scanner.nextInt();

        int numeroC;

        if (numeroA == numeroB) {
            numeroC = numeroA + numeroB;
        } else {
            numeroC = numeroA * numeroB;
        }

        System.out.println(numeroC);

        scanner.close();

    }
}
