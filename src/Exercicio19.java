public class Exercicio19 {
    /*
     * Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
     */

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println("Tabuada de " + i);
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d * %d = %d\n", i, j, (i * j));
            }
            System.out.println("-----");
        }
    }

}
