import java.util.Scanner;

/*    02) - Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
/     quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
/     pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
/     em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
/     conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve
/     sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e
/     decida se vai pagar a conta em dia ou não.

*/
public class Exercicio02l2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço por quilowatt de energia: ");
        double precoQuilowatt = input.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        double quilowattsConsumidos = input.nextDouble();

        double valorContaSemAtraso = precoQuilowatt * quilowattsConsumidos;

        double valorContaComAtraso = valorContaSemAtraso * 1.10;

        System.out.printf("Valor a ser pago (sem atraso): R$ %.2f%n", valorContaSemAtraso);
        System.out.printf("Valor a ser pago (com atraso - acrescido de 10%%): R$ %.2f%n", valorContaComAtraso);

        input.close();
    }
}