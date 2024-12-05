import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio13 {

    /*
     * Faça algoritmo que leia o nome e a idade de uma peso
     * Imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        
        System.out.print("Nome: ");
        String nomePessoa = scan.nextLine();
        
        System.out.print("Idade: ");
        int idade = scan.nextInt();

        System.out.println(nomePessoa + (idade >= 18 ? " Maior de idade" : " Menor de idade"));
        
        // Extra - Trabalho com localDate
        LocalDate dataAtual = LocalDate.now();
        System.out.println(nomePessoa + " " + (dataAtual.getYear() - idade));

        scan.close();

    }
}