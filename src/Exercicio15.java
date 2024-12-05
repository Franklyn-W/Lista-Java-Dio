import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio15 {
    /*
     * Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela
     * quantos anos, meses e dias essa pessoa ja viveu.
     * Leve em consideração o ano com 365 dias e o mês com 30 dias.
     *
     * (Ex: 5 anos, 2 meses e 15 dias de vida)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAtual = LocalDate.now();

        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine(), dtf);

        Long diferençaDatas = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        if (diferençaDatas > 365) {
            if (diferençaDatas / 365 == 1) {
                System.out.print(diferençaDatas / 365 + " ano, ");
            } else {
                System.out.print(diferençaDatas / 365 + " ano(s), ");
            }
            diferençaDatas -= 365 * (diferençaDatas / 365);
        }

        if (diferençaDatas > 30) {
            if (diferençaDatas / 30 == 1) {
                System.out.print(diferençaDatas / 30 + " mês");
                diferençaDatas -= 30 * (diferençaDatas / 30);
            } else {
                System.out.print(diferençaDatas / 30 + " meses");
                diferençaDatas -= 30 * (diferençaDatas / 30);
            }
            System.out.print(" e ");
        }

        if (diferençaDatas > 0) {
            if (diferençaDatas == 1) {
                System.out.println(diferençaDatas + " dia de vida");
            } else {
                System.out.println(diferençaDatas + " dias de vida");
            }
        }
        scanner.close();
    }

}
