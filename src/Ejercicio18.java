import java.util.UUID;

//18.Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.
public class Ejercicio18 {

    public static String passwordRamdom(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = (int) (Math.random() * caracteres.length());
            contraseña.append(caracteres.charAt(indiceAleatorio));
        }

        return contraseña.toString();
    }

    public static void main(String[] args) {
        String contraseña = passwordRamdom(8);
        System.out.println(contraseña);
    }
}
