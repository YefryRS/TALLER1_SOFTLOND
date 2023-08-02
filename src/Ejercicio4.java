import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //4 Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int edad = teclado2.nextInt();

        if(edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }

}