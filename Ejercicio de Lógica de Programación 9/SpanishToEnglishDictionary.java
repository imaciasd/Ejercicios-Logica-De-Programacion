import java.util.HashMap;
import java.util.Scanner;

public class SpanishToEnglishDictionary {
    public static void main(String[] args) {
        // Paso 1 y Paso 2: Crear el diccionario con las palabras en español y su traducción en inglés
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("hola", "hello");
        dictionary.put("adiós", "goodbye");
        dictionary.put("libro", "book");
        dictionary.put("árbol", "tree");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("agua", "water");
        dictionary.put("manzana", "apple");
        dictionary.put("plátano", "banana");
        dictionary.put("coche", "car");
        dictionary.put("avión", "airplane");
        dictionary.put("zapato", "shoe");
        dictionary.put("bolsa", "bag");
        dictionary.put("sombrero", "hat");
        dictionary.put("mesa", "table");
        dictionary.put("silla", "chair");
        dictionary.put("papel", "paper");

        // Paso 3: Solicitar al usuario una palabra en español
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String word = scanner.nextLine();
        scanner.close();

        // Paso 4: Buscar la traducción de la palabra ingresada en el diccionario
        String translation = dictionary.get(word);

        // Paso 5: Mostrar la traducción en inglés por consola
        if (translation != null) {
            System.out.println("Traducción en inglés: " + translation);
        } else {
            // Paso 6: Mostrar mensaje si la palabra no se encuentra en el diccionario
            System.out.println("La palabra no se encuentra en el diccionario");
        }
    }
}
