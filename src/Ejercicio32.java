import java.util.Scanner;

//32.Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).
public class Ejercicio32 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el numero que desea buscar");
        int number = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("El número " + number + " se encuentra en el índice: " + index);
        } else {
            System.out.println("El número " + number + " no se encuentra en el arreglo.");
        }


    }
}
