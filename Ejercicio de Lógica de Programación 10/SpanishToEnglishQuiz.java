import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class SpanishToEnglishQuiz {
    public static void main(String[] args) {
        // Paso 1 y Paso 2: Crear el diccionario con las palabras en español y su traducción en inglés
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("hola", "hello");
        dictionary.put("adiós", "goodbye");
        // Agregar más palabras al diccionario según se desee

        // Paso 3: Seleccionar al azar 5 palabras en español del diccionario
        ArrayList<String> randomWords = getRandomWords(dictionary, 5);

        // Paso 4 y Paso 5: Solicitar al usuario que ingrese la traducción en inglés y comprobar respuestas
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        for (String word : randomWords) {
            System.out.print("Traduce \"" + word + "\" al inglés: ");
            String userTranslation = scanner.nextLine().trim().toLowerCase();

            String correctTranslation = dictionary.get(word).toLowerCase();
            if (userTranslation.equals(correctTranslation)) {
                correctAnswers++;
            } else {
                incorrectAnswers++;
            }
        }
        scanner.close();

        // Paso 6: Mostrar el resultado del número de respuestas correctas e incorrectas
        System.out.println("Respuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + incorrectAnswers);
    }

    // Método para seleccionar al azar n palabras en español del diccionario
    public static ArrayList<String> getRandomWords(HashMap<String, String> dictionary, int n) {
        ArrayList<String> randomWords = new ArrayList<>(n);
        Random random = new Random();
        ArrayList<String> keys = new ArrayList<>(dictionary.keySet());

        for (int i = 0; i < n; i++) {
            String randomWord = keys.get(random.nextInt(keys.size()));
            randomWords.add(randomWord);
            keys.remove(randomWord);
        }

        return randomWords;
    }
}
