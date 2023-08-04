import java.util.Scanner;

public class Ejercicio14 {

    public static boolean esNumeroPerfecto(int numero) {
        if (numero <= 0) {
            return false;
        }

        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }

    public static void main(String[] args) {
        //14 Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.

        Scanner sistema = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero = sistema.nextInt();

        if (esNumeroPerfecto(numero)) {
            System.out.println("El número " + numero + " es un número perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un número perfecto.");
        }


    }

}
