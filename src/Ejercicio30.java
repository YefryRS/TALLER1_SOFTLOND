import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//30.Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.
public class Ejercicio30 {
    public static void main(String[] args) {
        int[] array = {4,2,3,4,5,2,2,3,9,1,7,2,6,9,8,6,3,2,4};
        Arrays.sort(array);
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            boolean duplicado = false;

            for (int j = 0; j < newArray.size(); j++) {
                if (array[i] == newArray.get(j)) {
                    duplicado = true;
                }
            }

            if(!duplicado) {
                newArray.add(array[i]);
            }
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }

    }
}
