//35.Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al 10. Usa para esto una matriz
public class Ejercicio35 {
    public static void main(String[] args) {
        int multiplicacion[][] = new int[10][10];

        for (int f = 0; f < 10; f++) {
            System.out.println("Tabla del " + (f+1) );
            for (int c = 0; c < 10; c++) {
                multiplicacion[f][c] = (f+1) * (c+1);
                System.out.println((f+1) + " * " + (c+1) + " = " + multiplicacion[f][c] );
            }
        }
    }
}
