import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado da divisão: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: você digitou texto em vez de número.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        } finally {
            System.out.println("Programa encerrado.");
            sc.close();
        }
    }
}