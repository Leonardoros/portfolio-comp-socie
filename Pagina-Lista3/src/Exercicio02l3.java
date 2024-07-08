import java.util.Scanner;

/*  02) - O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
/   Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
/   igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
/   calcular a média das notas. Faça um programa que leia as três notas do aluno e
/   apresente se ele deve ser aprovado ou não.
/   O programa deve apresentar a mensagem “Parabéns, você foi aprovado” ou
/   “Infelizmente, você não foi aprovado”, de acordo com as notas do aluno.
*/
public class Exercicio02l3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = input.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = input.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = input.nextDouble();

        boolean aprovado = notaTrabalho >= 7 && (notaProva1 >= 6 || notaProva2 >= 6);

        if (aprovado) {
            System.out.println("Parabéns, você foi aprovado.");
        } else {
            System.out.println("Infelizmente, você não foi aprovado.");
        }
        
        input.close();
    }
}