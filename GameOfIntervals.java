import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double number = 0;
        int counterTen = 0;
        int counterTwenty = 0;
        int counterThirty = 0;
        int counterFourty = 0;
        int counterFifty = 0;
        int counterInvalid = 0;
        double allStats = 0;
        for (int i = 0; i < n; i++) {
            number = Double.parseDouble(scanner.nextLine());
            if (number < 0 || number > 50) {
                allStats = allStats / 2;
                counterInvalid++;

            } else if (number >= 0 && number < 10) {
                counterTen++;
                allStats += number * 0.2;
            } else if (number >= 10 && number < 20) {
                counterTwenty++;
                allStats += number * 0.3;
            } else if (number >= 20 && number < 30) {
                counterThirty++;
                allStats += number * 0.4;
            } else if (number >= 30 && number < 40) {
                counterFourty++;
                allStats += 50;
            } else if (number >= 40 && number <= 50) {
                counterFifty++;
                allStats += 100;
            }

        }
        System.out.printf("%.2f", allStats);
        System.out.printf("%nFrom 0 to 9: %.2f", counterTen / n * 100);
        System.out.print("%");
        System.out.printf("%nFrom 10 to 19: %.2f", counterTwenty / n * 100);
        System.out.print("%");
        System.out.printf("%nFrom 20 to 29: %.2f", counterThirty / n * 100);
        System.out.print("%");
        System.out.printf("%nFrom 30 to 39: %.2f", counterFourty / n * 100);
        System.out.print("%");
        System.out.printf("%nFrom 40 to 50: %.2f", counterFifty / n * 100);
        System.out.print("%");
        System.out.printf("%nInvalid numbers: %.2f", counterInvalid / n * 100);
        System.out.print("%");


    }
}
