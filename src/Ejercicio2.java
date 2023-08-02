import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //2. Escribe un programa que pida al usuario un número entero y determine si es par o impar.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int numero = scanner.nextInt();

        if(numero % 2 == 0) {
            System.out.println(numero + " es un numero par");
        } else {
            System.out.println(numero + " es un numero impar");
        }

    }

}