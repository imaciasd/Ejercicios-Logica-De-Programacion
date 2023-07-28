import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Paso 1: Leer la palabra o frase ingresada por el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String input = scanner.nextLine();
        scanner.close();

        // Paso 2: Invertir el orden de los caracteres
        String reversed = reverseString(input);

        // Paso 3: Mostrar el resultado invertido por consola
        System.out.println("Texto invertido: " + reversed);
    }

    // Método para invertir el orden de los caracteres de una cadena
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}