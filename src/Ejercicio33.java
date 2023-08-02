import java.util.Arrays;

//33.Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.
public class Ejercicio33 {
    public static void main(String[] args) {

        int[]numbers = {3,3,3,1,2,4,2,2,6,1,4,4};
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            int contador = 0;

            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    contador+=1;
                }
            }

            boolean numeroRepetido = false;
            for (int k = i-1; k >=0 ; k--) {
                if (numbers[i] == numbers[k]) {
                    numeroRepetido = true;
                    break;
                }
            }

            if(!numeroRepetido) {
                System.out.println("El numero " + numbers[i] + " se encuentra en " + contador + " ocaciones");
            }

        }

    }
}
