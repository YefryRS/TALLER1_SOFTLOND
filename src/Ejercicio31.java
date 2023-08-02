import java.util.Arrays;

// 31.Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.
public class Ejercicio31 {
    public static void main(String[] args) {

        int[] array = {4,2,3,4,5,2,2,3,9,1,7,2,6,9,8,6,3,1,2,4};
        int cantidad = array.length;

        for (int i = 0; i < cantidad - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cantidad; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int intercambio = array[minIndex];
            array[minIndex] = array[i];
            array[i] = intercambio;
        }

        for (int number:array) {
            System.out.println(number);
        }

    }
}
