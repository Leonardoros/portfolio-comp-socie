import java.util.Scanner;

/*   03) - Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
/    imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2.
/    Além do IMC, o programa deve mostrar a situação da pessoa, de acordo com o seu IMC:
/    •   Abaixo de 20 – magro;
/    •   Entre 20 e 24,99 – normal;
/    •   Entre 25 e 30 – sobrepeso;
/    •   Acima de 30 – obeso.
*/ 
public class Exercicio03l3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (em Kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String situacao;
        if (imc < 20) {
            situacao = "Magro";
        } else if (imc >= 20 && imc < 25) {
            situacao = "Normal";
        } else if (imc >= 25 && imc <= 30) {
            situacao = "Sobrepeso";
        } else {
            situacao = "Obeso";
        }

        System.out.printf("O seu IMC é: %.2f%n", imc);
        System.out.println("Situação: " + situacao);
        
        scanner.close();
    }
}