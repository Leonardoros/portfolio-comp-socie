import java.util.Scanner;

/*    03) - Crie uma nova versão do programa da questão 2 para que ele mostre uma mensagem
/     indicando se a residência está com consumo elevado de energia. A empresa considera
/     consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.
*/
public class Exercicio03l2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = input.nextDouble();

        System.out.print("Digite o quarto número: ");
        double numero4 = input.nextDouble();

        double soma = numero1 + numero2 + numero3 + numero4;

        System.out.println("A soma dos quatro números é: " + soma);

        input.close();
    }
}