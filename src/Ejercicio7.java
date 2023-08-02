import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //7 Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero entero positivo");
        int numeroEntero = teclado.nextInt();

        if(numeroEntero > 0) {
            for (int i = 0; i <= 10; i++) {
                int multiplicacion = numeroEntero * i;
                System.out.println(numeroEntero + " * " + i +" = "+ multiplicacion);
            }
        } else {
            System.out.println("El numero introducido no es un numero positivo");
        }
    }
}
