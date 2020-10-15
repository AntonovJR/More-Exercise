import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double x = 0;
        for (int i = 0; i <n ; i++) {
            x+=Integer.parseInt(scanner.nextLine());


        }
        System.out.printf("%.2f",x/n);
    }
}
