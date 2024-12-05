import java.util.Scanner;

public class Exercicio7 {

    /*
     * Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se
     * ambos são VERDADEIRO ou FALSO.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean bool1 = scanner.nextBoolean();

        boolean bool2 = scanner.nextBoolean();

        if (bool1 == true && bool2 == true) {
            System.out.println("Verdeiro");
        } else {
            System.out.println("Falso");
        }

        scanner.close();
    }
}
