import java.util.Scanner;

//15 Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.

public class Ejercicio15 {
    private static void isCapicua(int number) {
        //convierto de int a String
        String stringNumber = String.valueOf(number);
        //Invierto la cadena
        String reverseNumber = new StringBuilder(stringNumber).reverse().toString();
        if(stringNumber.equals(reverseNumber)) {
            System.out.println( "el numero " + number + " es capicua");
        } else {
            System.out.println("el numero " + number + " No es capicua");
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int number = console.nextInt();
        isCapicua(number);
    }
}
