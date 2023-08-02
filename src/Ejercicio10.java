import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        //10 Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, ...

        int serieFibonacci = 20;
        int n1 = 0;
        int n2 = 1;
        int suma = 1;

        for (int i = 1; i <= serieFibonacci; i++) {
            System.out.println(n1);
            suma = n1 + n2;
            n1 = n2;
            n2 = suma;
        }

    }
}
