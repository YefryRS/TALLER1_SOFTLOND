import java.util.Scanner;

//23.Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String text = scanner.nextLine();

        int contador = 0;
        String array[] = text.split(" ");
        for (String item : array) {
            if(!item.isEmpty()) {
                contador = contador + 1;
            }
        }
        System.out.println("La oracion que colocaste tiene un total de " + contador + " palabras");


    }
}
