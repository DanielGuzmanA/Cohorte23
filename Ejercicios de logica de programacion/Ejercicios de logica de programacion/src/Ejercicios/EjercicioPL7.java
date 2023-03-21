package Ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class EjercicioPL7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        DayOfWeek diaSemana = null;

        while (diaSemana == null) {
            System.out.print("Ingresa un día de la semana (lunes a viernes): ");
            String diaSemanaString = scanner.nextLine().toLowerCase();

            try {
                diaSemana = DayOfWeek.valueOf(diaSemanaString.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: día de la semana inválido.");
            }
        }

       
        LocalTime hora = null;

        while (hora == null) {
            System.out.print("Ingresa una hora (formato HH:mm): ");
            String horaString = scanner.nextLine();

            try {
                hora = LocalTime.parse(horaString);
            } catch (DateTimeParseException e) {
                System.out.println("Error: hora inválida.");
            }
        }

        scanner.close();

       
        LocalDateTime ahora = LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.nextOrSame(diaSemana)), hora);
        LocalDateTime inicioFinDeSemana = ahora.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
                .with(LocalTime.of(15, 0));

        long minutosRestantes = ahora.until(inicioFinDeSemana, ChronoUnit.MINUTES);

        
        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");
    }
};

