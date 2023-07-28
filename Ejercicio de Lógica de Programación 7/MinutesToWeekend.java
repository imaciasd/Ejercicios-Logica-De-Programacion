import java.util.Scanner;

public class MinutesToWeekend {
    public static void main(String[] args) {
        // Paso 1: Leer el día de la semana y la hora ingresados por el usuario
        Scanner scanner = new Scanner(System.in);
        String day;
        int hours, minutes;

        do {
            System.out.print("Ingresa el día de la semana (Lunes - Viernes): ");
            day = scanner.nextLine().trim().toLowerCase();
        } while (!isValidDay(day));

        do {
            System.out.print("Ingresa la hora (horas y minutos, formato 24 horas): ");
            String time = scanner.nextLine().trim();
            String[] timeParts = time.split(":");
            if (timeParts.length == 2) {
                try {
                    hours = Integer.parseInt(timeParts[0]);
                    minutes = Integer.parseInt(timeParts[1]);
                } catch (NumberFormatException e) {
                    hours = -1;
                    minutes = -1;
                }
            } else {
                hours = -1;
                minutes = -1;
            }
        } while (!isValidTime(hours, minutes));

        scanner.close();

        // Paso 3: Calcular la cantidad de minutos que faltan para el fin de semana
        int minutesToWeekend = calculateMinutesToWeekend(day, hours, minutes);

        // Paso 4: Mostrar el resultado por consola
        System.out.println("Faltan " + minutesToWeekend + " minutos para el fin de semana");
    }

    // Método para verificar si el día ingresado es válido
    public static boolean isValidDay(String day) {
        return day.equals("lunes") || day.equals("martes") || day.equals("miércoles") ||
                day.equals("miercoles") || day.equals("jueves") || day.equals("viernes");
    }

    // Método para verificar si la hora ingresada es válida
    public static boolean isValidTime(int hours, int minutes) {
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60);
    }

    // Método para calcular la cantidad de minutos que faltan para el fin de semana
    public static int calculateMinutesToWeekend(String day, int hours, int minutes) {
        int minutesToWeekend = 0;
        int totalMinutesInDay = 24 * 60;
        int minutesTillFriday = 0;

        if (day.equals("lunes")) {
            minutesTillFriday = (4 * totalMinutesInDay) + (15 * 60);
        } else if (day.equals("martes")) {
            minutesTillFriday = (3 * totalMinutesInDay) + (15 * 60);
        } else if (day.equals("miércoles") || day.equals("miercoles")) {
            minutesTillFriday = (2 * totalMinutesInDay) + (15 * 60);
        } else if (day.equals("jueves")) {
            minutesTillFriday = (1 * totalMinutesInDay) + (15 * 60);
        } else if (day.equals("viernes")) {
            minutesTillFriday = 15 * 60;
        }

        // Restamos los minutos ingresados por el usuario
        minutesToWeekend = minutesTillFriday - (hours * 60 + minutes);

        return minutesToWeekend;
    }
}
