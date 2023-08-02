import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //3. Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el radio del circulo");
        int radio = teclado.nextInt();

        double areaCirculo = (Math.PI) * Math.pow(radio,2);
        double perimetroCirculo = 2 * Math.PI * radio;

        System.out.println("El area del circulo es de: " + areaCirculo + "cm2");
        System.out.println("El perimetro del circulo es de: " + perimetroCirculo + "cm2");

    }

}