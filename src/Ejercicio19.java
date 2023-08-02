import java.util.Scanner;

//19.Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre = scanner.next();

        String nombreMinuscula = nombre.toLowerCase();
        String nombreMayuscula = nombre.toUpperCase();
        System.out.println(nombreMinuscula);
        System.out.println(nombreMayuscula);

    }
}
