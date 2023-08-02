import java.util.Scanner;

// 25.Pide al usuario una frase y muestra cada palabra por separado
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String text = scanner.nextLine();

        String array[] = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
