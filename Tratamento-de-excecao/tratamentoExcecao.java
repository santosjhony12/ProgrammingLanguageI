import java.util.Scanner;

public class tratamentoExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            int resultado = 10 / numero;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Você deve digitar um número inteiro.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
