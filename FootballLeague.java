import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double stadiumPlaces = Double.parseDouble(scanner.nextLine());
        double fans = Double.parseDouble(scanner.nextLine());
        int counterA = 0;
        int counterB = 0;
        int counterV = 0;
        int counterG = 0;
        for (int i = 0; i < fans; i++) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("a")) {
                counterA++;
            } else if (input.equals("b")) {
                counterB++;
            } else if (input.equals("v")) {
                counterV++;
            } else if (input.equals("g")) {
                counterG++;
            }
        }


        System.out.printf("%.2f", counterA / fans * 100);
        System.out.print("%");
        System.out.printf("%n%.2f", counterB / fans * 100);
        System.out.print("%");
        System.out.printf("%n%.2f", counterV / fans * 100);
        System.out.print("%");
        System.out.printf("%n%.2f", counterG / fans * 100);
        System.out.print("%");
        System.out.printf("%n%.2f", fans / stadiumPlaces * 100);
        System.out.print("%");


    }
}