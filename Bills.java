import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double months = Double.parseDouble(scanner.nextLine());
        double other = 0;
        double electricity = 0;
        double total = 0;
        for (int i = 0; i < months; i++) {
            double bils = Double.parseDouble(scanner.nextLine());
            electricity += bils;
            other += (bils + 35) * 1.2;


        }
        total = electricity + other+(35*months);
        System.out.printf("Electricity: %.2f lv", electricity);
        System.out.printf("%nWater: %.2f lv", months * 20);
        System.out.printf("%nInternet: %.2f lv", months * 15);
        System.out.printf("%nOther: %.2f lv", other);
        System.out.printf("%nAverage: %.2f lv", total / months);
    }
}
