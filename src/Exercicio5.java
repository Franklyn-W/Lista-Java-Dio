import java.util.Scanner;

public class Exercicio5 {
    /*
     * Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de
     * um usuário.
     * Calcule quantos salários mínimos esse usuário ganha e imprima na tela o
     * resultado.
     * (Base para o Salário mínimo R$ 1.293,20).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioBase = 1293.20;

        double salarioUsuario = scanner.nextDouble();

        System.out.printf("O usuario recebe %.2f salarios minimos.", salarioUsuario / salarioBase);

        scanner.close();

    }
}
