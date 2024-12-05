import java.util.Scanner;

public class Exercicio23 {
    /*
     * Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
     * As informações fornecidas serão: valor da hora aula, número de aulas
     * lecionadas
     * no mês e percentual de desconto do INSS.
     * Imprima na tela o salário líquido final.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da hora aula: ");
        double valorHoraAula = scan.nextDouble();

        System.out.print("Informe o numero de aula lecionadas no mês: ");
        int numeroAulas = scan.nextInt();

        double baseCalculo = valorHoraAula * numeroAulas;
        double impostoINSS = 0;

        if (baseCalculo > 4000.03) {
            baseCalculo -= 4000.03;
            impostoINSS += baseCalculo * 0.14;
            baseCalculo = 4000.03;
        }
        if (baseCalculo > 2666.68) {
            baseCalculo -= 2666.68;
            impostoINSS += baseCalculo * 0.12;
            baseCalculo = 2666.68;
        }
        if (baseCalculo > 1412) {
            baseCalculo -= 1412;
            impostoINSS += baseCalculo * 0.09;
            baseCalculo = 1412;
        }
        if (baseCalculo == 1412) {
            impostoINSS += baseCalculo * 0.075;
        } else {
            System.out.println("Salario informado menor que o minimo.");
        }

        System.out.printf("O salario liquido final será de %.2f, decontando INSS de %.2f",
                (valorHoraAula * numeroAulas) - impostoINSS, impostoINSS);

        scan.close();
    }
}
