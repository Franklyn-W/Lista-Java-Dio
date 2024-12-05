import java.util.Scanner;

public class Exercicio12 {
    /*
     * Faça um algoritmo que leia o valor de um produto e determine o valor que deve
     * ser pago, conforme a escolha da forma de pagamento pelo comprador
     * Imprima na tela o valor final do produto a ser pago.
     * Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo
     * adequado.
     * 
     * Tabela de Código de Condições de Pagamento
     * 
     * 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
     * 2 - À Vista no cartão de crédito, recebe 10% de desconto
     * 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
     * 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais
     * juros de 10%
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inseira o valor do produto: ");
        double valorProduto = scan.nextDouble();

        System.out.println("Condições de pagamento" +
                "\n1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto" +
                "\n2 - À Vista no cartão de crédito, recebe 10% de desconto" +
                "\n3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros" +
                "\n4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

        System.out.println("Escolha a condição de pagamento");
        int formaPagamento = scan.nextInt();

        switch (formaPagamento) {
            case 1:
                System.out.println("Total a ser pago: " + (valorProduto * 0.85));
                break;

            case 2:
                System.out.println("Total a ser pago: " + (valorProduto * 0.90));
                break;

            case 3:
                System.out.println("Total a ser pago: " + (valorProduto));

            case 4:
                System.out.println("Total a ser pago: " + (valorProduto * 1.10));

            default:
                System.out.println("Forma de pagamento não permitida.");
                break;
        }

        scan.close();

    }
}
