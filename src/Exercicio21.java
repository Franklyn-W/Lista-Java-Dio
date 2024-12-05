import java.util.Random;

public class Exercicio21 {
    /*
     * Faça um algoritmo que mostre um valor aleatório entre 0 e 100
     */

    public static void main(String[] args) {

        // Método 1
        int numAleatorio = (int) (Math.random()*100);

        System.out.println(numAleatorio);

        // Método 2
        Random gerador = new Random();
        System.out.println(gerador.nextInt(101));
    }

}
