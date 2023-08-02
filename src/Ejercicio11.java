import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        //11 Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la longitud del lado 1");
        double lado1 = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingresa la longitud del lado 2");
        double lado2 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingresa la longitud del lado 3");
        double lado3 = scanner3.nextDouble();

        double perimetro = (lado1+lado2+lado3)/2;

        double areaTriangulo = Math.sqrt((perimetro)*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado3));

        System.out.println("El area del triangulo que ha ingresado es de: " + areaTriangulo);

    }

}
