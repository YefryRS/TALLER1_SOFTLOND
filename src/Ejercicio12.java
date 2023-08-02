import java.util.Scanner;

public class Ejercicio12 {

    public static boolean esPrimo(int n) {

        if(n <= 1) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else {
            for (int i = 2; i < n; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        //12 Realiza un programa que pida al usuario un número entero y determine si es un número primo o no
        Scanner consola = new Scanner(System.in);
        System.out.println("Coloca un numero entero");
        int num = consola.nextInt();

        System.out.println(esPrimo(num));

    }

}
