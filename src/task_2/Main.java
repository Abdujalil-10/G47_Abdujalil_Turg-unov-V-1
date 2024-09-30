package task_2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2024, 9, 1, 0, 0, 0);
        System.out.println(countingHour(ldt1, ldt2));
    }

    private static int countingHour(LocalDateTime ldt1, LocalDateTime ldt2) {
        int soat = 0;
        while (ldt1.isBefore(ldt2)) {
            if (ldt1.getDayOfWeek().getValue() == 7) {
                soat += 0;
            } else if (ldt1.getDayOfWeek().getValue() == 6) {
                soat += 4;
            } else {
                soat += 8;
            }
            ldt1 = ldt1.plusDays(1);
        }
        return soat;
    }
}
