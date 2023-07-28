import java.util.Scanner;

public class PrimesAtFront {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] primesArray = new int[10];
        int[] nonPrimesArray = new int[10];
        int primesCount = 0;
        int nonPrimesCount = 0;

        // Paso 1: Leer los 10 números ingresados por el usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Paso 2 y Paso 3: Identificar los números primos y no primos
        for (int i = 0; i < 10; i++) {
            if (isPrime(numbers[i])) {
                primesArray[primesCount] = numbers[i];
                primesCount++;
            } else {
                nonPrimesArray[nonPrimesCount] = numbers[i];
                nonPrimesCount++;
            }
        }

        // Paso 4: Concatenar los arrays de números primos y no primos
        int[] finalArray = new int[10];
        System.arraycopy(primesArray, 0, finalArray, 0, primesCount);
        System.arraycopy(nonPrimesArray, 0, finalArray, primesCount, nonPrimesCount);

        // Paso 5: Mostrar el array final con los números primos al inicio
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + finalArray[i]);
        }
    }

    // Método para verificar si un número es primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
