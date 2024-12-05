import java.util.Scanner;

public class Exercicio24 {
    /*
     * Faça um algoritmo que calcule a quantidade de litros de combustível gastos em
     * uma viagem.
     * Sabendo que o carro faz 12km com um litro.
     * 
     * Deve-se fornecer ao usuário:
     * Tempo que será gasto na viagem a sua velocidade média
     * Distância percorrida
     * Quantidade de litros utilizados para fazer a viagem.
     * 
     * Fórmula: distância = tempo x velocidade.
     * 
     * litros usados = distância / 12.
     * 
     * >> Enunciado da questão foi mal desenvolvida.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tempo de viagem em minutos ");

        int tempoViagem = scan.nextInt();

        System.out.printf("Informe a distancia percorrida: ");
        double distancia = scan.nextDouble();

        // Tempo gasto na viagem
        System.out.printf("Tempo para percorrer 1 km: %.2f minutos\n", (distancia / (tempoViagem)));

        // Velocidade média
        System.out.printf("A velocidad média da viagem foi de %.2fkm/h\n", (distancia/(tempoViagem/60)));

        // Calcular quantidade de combustivel
        System.out.printf("Foram gastos aproximadamente %.2f litros de combustivel", ((distancia) / 12));

        scan.close();
    }
}
