
/*  01) - Apresente os resultados (true ou false) das seguintes expressões:
/   5 + 3 * 6 / 2 >= 10
/   36 / 3 * 2 – 5 +8 == 27
/   ! (30 / 4 * 6 == 15)
/   (30 % 4 * 6 == 12) || true
/   (5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8)
/   (((5 * 7 % 3 + 5) / 2 + 5) <= 14) II (! (12 / 4 < 8 * 2))
*/
public class Exercicio01l2 {
    public static void main(String[] args) {

     boolean resultado1 = (5 + 3 * 6) / 2 >= 10;
    System.out.println("Resultado da expressão 1: " + resultado1);
 
     boolean resultado2 = (36 / 3 * 2 - 5 + 8) == 27;
    System.out.println("Resultado da expressão 2: " + resultado2);
 
     boolean resultado3 = !(30 / 4 * 6 == 15);
    System.out.println("Resultado da expressão 3: " + resultado3);
 
     boolean resultado4 = (30 % 4 * 6 == 12) || true;
    System.out.println("Resultado da expressão 4: " + resultado4);
 
     boolean resultado5 = ((5 * 7 % 3) + 4 / 2 + 5 == 12) && (12 / 4 < 8);
    System.out.println("Resultado da expressão 5: " + resultado5);
 
     boolean resultado6 = (((5 * 7 % 3 + 5) / 2 + 5) <= 14) || (!(12 / 4 < 8 * 2));
    System.out.println("Resultado da expressão 6: " + resultado6);
    }
}