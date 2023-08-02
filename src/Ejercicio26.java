import java.util.Scanner;

//26.Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String text = scanner.nextLine();

        int cantidadCaracteres = text.length();
        String espacio = " ";

        String array[] = text.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(espacio)) {
                cantidadCaracteres-=1;
            }
        }

        System.out.println(cantidadCaracteres);
    }
}
