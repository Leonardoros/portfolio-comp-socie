import java.util.Scanner;

/*   03) - Crie uma função que receba dois números reais como parâmetro e retorne o maior
/    deles. Elabore um programa que leia dois valores e apresente o maior, usando esta
/    função.
*/
public class Exercicio03l4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double num2 = scanner.nextDouble();

        double maior = maiorNumero(num1, num2);

        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }

    public static double maiorNumero(double a, double b) {
        return (a > b) ? a : b;
    }
}