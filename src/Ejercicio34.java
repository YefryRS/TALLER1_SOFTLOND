import java.util.Scanner;

//34.Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
public class Ejercicio34 {
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
        int ultimo = arreglo[9];

        for (int i = 8; i >= 0 ; i--) {
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo;

        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Index " + i +": "+ arreglo[i]);
        }
    }
}
