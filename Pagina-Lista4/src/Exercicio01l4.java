import java.util.Scanner;

/*   01) - Crie um programa que leia as medidas da base e altura de um retângulo, calcule e
/    apresente a área e o perímetro deste retângulo. Crie uma função para calcular a área e
/    outra para calcular o perímetro.
*/
public class Exercicio01l4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida da base do retângulo: ");
        double base = input.nextDouble();

        System.out.print("Digite a medida da altura do retângulo: ");
        double altura = input.nextDouble();

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        System.out.printf("A área do retângulo é: %.2f%n", area);
        System.out.printf("O perímetro do retângulo é: %.2f%n", perimetro);
        
        input.close();
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}