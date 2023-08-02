import java.util.Scanner;

public class Ejercicio14 {

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
        //14 Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.

        Scanner sistema = new Scanner(System.in);
        System.out.println("Escribe un numero decimal");
        int numero = sistema.nextInt();

        if(esPrimo(numero)) {
            int numeroPerfecto = (int) (
                    (Math.pow(2,numero - 1)) *
                    (Math.pow(2,numero) -1)
            );
            System.out.println("El numero " + numero + " da como resultado " + numeroPerfecto + ", que es un numero perfecto");
        } else {
            System.out.println("El numero proporcionado no da como resultado un numero perfecto");
        }


    }

}
