import java.util.Scanner;

//16.Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario.
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int serieFibonacci = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int suma = 1;

        for (int i = 1; i <= serieFibonacci; i++) {
            System.out.println(n1);
            suma = n1 + n2;
            n1 = n2;
            n2 = suma;
        }
    }
}
