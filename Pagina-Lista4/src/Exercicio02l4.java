import java.util.Scanner;

/*   02) - Faça um programa que leia dois números inteiros, calcule e apresente:
/    - Soma dos números.
/    - Subtração do primeiro pelo segundo.
/    - Multiplicação dos números.
/    - Divisão do primeiro pelo segundo.
/      Elabore uma função para efetuar cada operação. As funções devem receber por
/      parâmetro os dois números e retornar o resultado usando o comando return.
*/
public class Exercicio02l4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int soma = somar(num1, num2);
        int subtracao = subtrair(num1, num2);
        int multiplicacao = multiplicar(num1, num2);
        double divisao = dividir(num1, num2);

        System.out.println("Soma dos números: " + soma);
        System.out.println("Subtração do primeiro pelo segundo: " + subtracao);
        System.out.println("Multiplicação dos números: " + multiplicacao);
        System.out.println("Divisão do primeiro pelo segundo: " + divisao);
        
        scanner.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        }
    }
}