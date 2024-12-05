import java.util.Scanner;

public class Exercicio10 {
    /*
     * Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela
     * a média das notas.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double media = 0;

        for (int i = 0; i < 3; i++) {
            media += scanner.nextDouble();
        }

        System.out.printf("%.2f", media / 3);

        scanner.close();
    }
}
