import java.util.Scanner;

// 21.Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String text = scanner.next();

        int cantidadVeces = 0;
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe la letra que deseas encontrar");
        String letraAEncontrar = consola.next();

        String array[] = text.split("");
        if(letraAEncontrar.length() == 1)  {
            for (String letra:array) {
                if(letra.equals(letraAEncontrar)) {
                    cantidadVeces = cantidadVeces+1;
                }
            }
            System.out.println("la letra " + '"'+letraAEncontrar+'"' + " aparece en " +cantidadVeces + " ocaciones");
        }
        else {
            System.out.println("La letra no es valida");
        }

    }
}
