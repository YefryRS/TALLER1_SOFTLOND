import java.util.Scanner;

// 22.Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
public class Ejercicio22 {

    public static boolean palidromo(String text) {
        text = text.toLowerCase();
        text = text.replace(" ", "");

        text = text.replace("á", "a");
        text = text.replace("é", "e");
        text = text.replace("í", "i");
        text = text.replace("ó", "o");
        text = text.replace("ú", "u");

        int a = 0;
        int b = text.length() -1;

        for (int i = 0; i < text.length(); i++) {
            if( text.charAt(a) == text.charAt(b) ) {
                a++;
                b--;
            } else {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String text = scanner.next();

        boolean palindromo = palidromo(text);
        System.out.println(palindromo);
    }
}
