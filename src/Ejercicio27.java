import java.util.Arrays;
import java.util.Scanner;

//27.Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una frase");
        String frase = scanner.nextLine();

        String array[] = frase.split(" ");
        Arrays.sort(array);
        for (String palabra:array) {
            System.out.println(palabra);
        }
    }
}
