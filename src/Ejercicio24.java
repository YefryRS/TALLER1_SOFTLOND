import java.util.Scanner;

// 24.Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String text = scanner.nextLine();

        System.out.println("Escribe la letra que deseas reemplazar");
        String letraReemplazar= scanner.nextLine();

        System.out.println("Escribe la nueva letra ");
        String letraNueva = scanner.nextLine();

        String nuevaCadena = "";

        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);
            if (letra == letraReemplazar.charAt(0)) {
                nuevaCadena += letraNueva;
            } else {
                nuevaCadena += letra;
            }
        }
        System.out.println("Cadena resultante: " + nuevaCadena);

    }
}
