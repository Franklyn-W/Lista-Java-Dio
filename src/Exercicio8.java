import java.util.*;

public class Exercicio8 {

    /*
     * Faça um algoritmo que leia três valores inteiros diferentes
     * Imprima na tela os valores em ordem decrescente.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listaInteiros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int numero = scanner.nextInt();
            listaInteiros.add(numero);
        }

        Collections.sort(listaInteiros);

        System.out.println(listaInteiros);

        scanner.close();

    }
}
