import java.util.Scanner;

//17.Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.
public class Ejercicio17 {
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
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Escribe el segundo numero");
        int number2 = scanner2.nextInt();

        for (int i = number1; i < number2; i++) {
            if (esPrimo(i)) {
                System.out.println("El numero " + i +" es un numero primo");
            }
        }

    }
}
