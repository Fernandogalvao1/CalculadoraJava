import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("Digite qual operação: +, -, *, /");
        char operador = scanner.next().charAt(0); //(0) armazena o primeiro caractere da String
        scanner.close();
        float resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido");
                return;
        }

        System.out.println(num1 + " " + operador + " " + num2 + ": " + resultado);
    }
}