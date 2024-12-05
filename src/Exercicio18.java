import java.util.Scanner;

public class Exercicio18 {

    /*
     * Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e
     * cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela
     * em quantos anos serão necessários para que Francisco seja menor que Sara.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double alturaF = 1.5;
        double alturaS = 1.1;

        int anos = 0;
        while (alturaF > alturaS) {
            alturaF += 0.02;
            alturaS += 0.03;
            anos ++;
        }

        System.out.printf("Após %d anos, Sara será maior que Franciso, tendo %.2f e %.2f respectivamente", anos, alturaS, alturaF);

        scan.close();
    }
}
