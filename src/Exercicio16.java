import java.util.Scanner;

public class Exercicio16 {

    /*
     * Faça um algoritmo que leia três valores que representam os três lados de um
     * triângulo
     * Verifique se são válidos
     * Determine se o triângulo é equilátero, isósceles ou escaleno.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o comprimentos dos tres lados do triangulo");
        int ladoA = scan.nextInt();
        int ladoB = scan.nextInt();
        int ladoC = scan.nextInt();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.print("As medidas infomadas forma um triangulo do tipo ");
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("equilátero");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                System.out.println("isósceles");
            } else {
                System.out.println("escaleno");
            }

        } else {
            System.out.println("Medidas informadas não formam triangulo");
        }

        scan.close();
    }
}
