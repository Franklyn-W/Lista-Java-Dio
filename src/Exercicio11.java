import java.util.Scanner;

public class Exercicio11 {

    /*
     * Faça um algoritmo que leia quatro notas obtidas por um aluno
     * Calcule a média das nota obtidas
     * Imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado.
     * Para o aluno ser considerado aprovado sua média final deve ser maior ou igual
     * a 7.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota = 0;

        for (int i = 0; i < 4; i++) {
            nota += scanner.nextDouble();
        }

        System.out.println(((nota/4) >= 7) ? "Aprovado" : "Reprovado");

        scanner.close();

    }



}
