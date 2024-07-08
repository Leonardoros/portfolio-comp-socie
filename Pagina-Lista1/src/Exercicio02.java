import java.util.Scanner;

// 02 - Implemente um programa em java que solicite ao usuário a entrada de três números de ponto flutuante e mostre a soma deles.

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = input.nextDouble();

        double soma = numero1 + numero2 + numero3;

        System.out.println("A soma dos três números é: " + soma);

        input.close();
    }
}