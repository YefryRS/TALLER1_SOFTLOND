//28.Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
public class Ejercicio28 {
    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5,6,7};
        int suma = 0;

        for (int num:enteros) {
            suma+=num;
        }
        System.out.println("La suma de los numeros es: " + suma);
    }
}
