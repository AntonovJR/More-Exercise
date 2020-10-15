import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int payment = 0;
        double paymentCash = 0;
        double paymentCredit = 0;
        int counterCash = 0;
        int counterCard = 0;
        int counter = 1;
        double total = 0;
        while (!command.equals("End")) {
            payment = Integer.parseInt(command);
            if (counter % 2 == 0) {
                if (payment > 10) {
                    paymentCredit += payment;
                    System.out.println("Product sold!");
                    counterCard++;
                    counter++;

                } else {
                    System.out.println("Error in transaction!");
                    counter++;
                }

            }
            else {
                if (payment > 100) {
                    System.out.println("Error in transaction!");
                    counter++;
                } else {
                    paymentCash += payment;
                    System.out.println("Product sold!");
                    counterCash++;
                    counter++;

                }
            }
            total = paymentCash + paymentCredit;
            if (total >= budget) {
                System.out.printf("Average CS: %.2f", paymentCash / counterCash);
                System.out.printf("%nAverage CC: %.2f", paymentCredit / counterCard);
                return;
            }
command = scanner.nextLine();

        }
        System.out.println("Failed to collect required money for charity.");

    }
}
