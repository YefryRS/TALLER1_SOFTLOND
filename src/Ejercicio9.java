import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        //9 Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
        Scanner tecladoUser = new Scanner(System.in);
        System.out.println("Digita un entero positivo");
        int numeroPositivo = tecladoUser.nextInt();
        long factorial = 1;

        for (int i = 1; i <= numeroPositivo; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);

    }
}
