import java.util.Scanner;

/*  01) - Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
/   quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
/   pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
/   em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
/   conta. Além disto, o programa deve mostrar uma mensagem indicando se a residência
/   está com consumo elevado de energia. A empresa considera consumo elevado de
/   energia, se a residência consumir mais de de 70 quilowatts.
*/
public class Exercicio01l3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do quilowatt de energia: ");
        double precoPorQuilowatt = input.nextDouble();

        System.out.print("Digite a quantidade gasta de quilowatts: ");
        double quantidadeGasta = input.nextDouble();

        double valorConta = precoPorQuilowatt * quantidadeGasta;

        double valorComAtraso = valorConta * 1.10;

        String mensagemConsumo;
        if (quantidadeGasta > 70) {
            mensagemConsumo = "Consumo elevado de energia.";
        } else {
            mensagemConsumo = "Você é um consumidor consciente.";
        }

        System.out.println("Valor a ser pago se a conta for paga no dia: R$" + valorConta);
        System.out.println("Valor a ser pago se a conta for paga com atraso: R$" + valorComAtraso);
        System.out.println(mensagemConsumo);
        
        input.close();
    }
}