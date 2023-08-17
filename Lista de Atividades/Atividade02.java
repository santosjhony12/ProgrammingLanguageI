import java.sql.SQLOutput;

public class Atividade02 {
    public static void main(String[] args){
        /*EXERCICIO A*/
        System.out.println("Exercicio A");
        int a = 5;
        int b= 20;
        System.out.println("B = "+b);
        b = 5;
        System.out.println("A = "+a+"\nB = "+b);

        /*EXERCICIO B*/
        System.out.println("\n\nExercio B");
        a = 30;
        b = 20;
        int c = a+b;
        System.out.println("C = "+c);
        b = 10;
        System.out.println("B = "+b+"\nC = "+c);
        c = a+b;
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);

        /*EXERCICIO C*/
        System.out.println("\n\nEXERCICIO C");
        a = 10;
        b = 20;
        c = a;
        b = c;
        a = b;
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);

        /*EXERCICIO D*/
        System.out.println("\n\nEXERCICIO D");
        a = 10;
        b = a+1;
        a = b+1;
        b = a+1;
        System.out.println("A = "+a);
        a = b+1;
        System.out.println("A = "+a+"\nB = "+b);

    }
}
