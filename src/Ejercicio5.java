import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //5 Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe el primer numero entero");
        int usuario1 = consola.nextInt();

        Scanner consola2 = new Scanner(System.in);
        System.out.println("Escribe el segundo numero entero");
        int usuario2 = consola2.nextInt();

        if(usuario1 > usuario2) {
            System.out.println("el numero " + usuario1 + " es mayor al numero " + usuario2);
        } else if (usuario2 > usuario1) {
            System.out.println("el numero " + usuario2 + " es mayor al numero " + usuario1);
        } else {
            System.out.println("Los numeros son iguales");
        }

    }

}