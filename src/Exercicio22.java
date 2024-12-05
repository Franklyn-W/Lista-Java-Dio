import java.util.Scanner;

public class Exercicio22 {
    /*
     * Faça um algoritmo que leia dois valores inteiros A e B
     * Imprima na tela o quociente e o resto da divisão inteira entre eles.
     */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dividendo: ");
        int numeroA = scanner.nextInt();

        System.out.print("Informe o divisor: ");
        int numeroB = scanner.nextInt();

        System.out.printf("O quociente da divisão de %d / %d é igual a %d e o resto é igual a %d", numeroA, numeroB, (numeroA / numeroB), (numeroA % numeroB));

        scanner.close();
    }
}
