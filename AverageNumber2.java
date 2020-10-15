import java.util.Scanner;

public class AverageNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double x = 0;
        while (counter < n) {
            x += Integer.parseInt(scanner.nextLine());
            counter++;

        }
        System.out.printf("%.2f", x / n);
    }
}
