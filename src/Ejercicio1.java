import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1. Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe el primer numero entero");
        int numero1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Escribe el segundo numero entero");
        int numero2 = scanner2.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);

    }

}