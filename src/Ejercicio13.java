import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        //13.Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero decimal");
        double numDecimal = teclado.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println(decimalFormat.format(numDecimal));


    }

}
