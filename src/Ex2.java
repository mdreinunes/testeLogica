import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 0;
        Scanner scann = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int numero = scann.nextInt();

        System.out.println(num2);
        System.out.println(num1);


        for (int i = 0; i < numero; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
            if (numero == num1) {
                System.out.println("O numero " + numero + " esta na sequencia Fibonacci!");
                i = numero;
            }
        }
    }
}
