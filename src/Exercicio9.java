import java.util.Scanner;

public class Exercicio9 {
    /*
     * Faça um algoritmo que calcule o imc (Índice de Massa Corporal) de uma pessoa.
     * Leia o seu peso e sua altura e imprima na tela sua condição de acordo com a
     * tabela abaixo:
     * 
     * Fórmula do imc = peso / (altura) ²
     * 
     * Tabela Condições imc
     * 
     * Abaixo de 18,5 | Abaixo do peso
     * Entre 18,6 e 24,9 | Peso ideal (parabéns)
     * Entre 25,0 e 29,9 | Levemente acima do peso
     * Entre 30,0 e 34,9 | Obesidade grau I
     * Entre 35,0 e 39,9 | Obesidade grau II (severa)
     * Maior ou igual a 40 | Obesidade grau III (mórbida)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double alturaMm = scanner.nextDouble()/100;

        double peso = scanner.nextDouble();

        double imc = (peso / (alturaMm*alturaMm));
        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso ideal");
        } else if (imc < 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

        scanner.close();
    }
}
