import java.util.Scanner;

public class At05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int valor = scanner.nextInt();
        System.out.println("O seu antecessor é: "+(valor-1));
    }
}

