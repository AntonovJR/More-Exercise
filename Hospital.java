import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int patients = 0;
        int treated = 0;
        int untreated = 0;
        int doctors = 7;
        for (int i = 1; i <= days; i++) {
            if (i % 3 == 0 && treated < untreated) {
                doctors++;
            }
            patients = Integer.parseInt(scanner.nextLine());

            if (patients <= doctors) {
                treated += patients;
            } else {
                treated += doctors;

                untreated = untreated + (patients - doctors);
            }

        }



        System.out.printf("Treated patients: %d.", treated);
        System.out.printf("%nUntreated patients: %d.", untreated);
    }
}