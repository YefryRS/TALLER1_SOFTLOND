import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //8 Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

        double numeroAleatoria = Math.random() * 100 + 1;
        int numeroRamdon = (int) numeroAleatoria;
        System.out.println(numeroRamdon);

        Scanner consola = new Scanner(System.in);
        System.out.println("Adivina el numero");
        int numeroUsuario = consola.nextInt();

        if(numeroUsuario > numeroRamdon) {
            System.out.println("El numero " + numeroUsuario + " es mayor al numero " + numeroRamdon);
        } else if (numeroRamdon > numeroUsuario) {
            System.out.println("El numero " + numeroRamdon + " es mayor al numero " + numeroUsuario);
        } else {
            System.out.println("Ambos numero son iguales");
        }

    }
}
