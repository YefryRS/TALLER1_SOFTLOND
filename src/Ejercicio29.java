//29.Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.
public class Ejercicio29 {
    public static void main(String[] args) {
        int[] enteros = {1,22,3,45,15,16,800,750,749,500,600};
        int numMayor = 0;

        for (int num:enteros) {
            if(num > numMayor) {
                numMayor = num;
            }
        }
        System.out.println("El numero mayor es: " + numMayor);
    }
}
