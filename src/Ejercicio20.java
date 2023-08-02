import java.util.Scanner;

// 20.Realiza un programa que solicite al usuario una cadena y luego invierta su orden
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String text = scanner.next();

        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }
}
