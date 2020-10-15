import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detergent = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int secondInput = 0;
        int dishes = 0;
        int pot = 0;
        int counter = 1;
        int milliliters = detergent * 750;
        int leftOver = 0;

        while (!input.equals("End")) {
            secondInput = Integer.parseInt(input);
            if (counter % 3 == 0) {
                pot += secondInput;

            } else {
                dishes += secondInput;

            }
            counter++;
            leftOver = milliliters - (dishes * 5 + pot * 15);
            if (leftOver < 0) {

                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(leftOver));
                return;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.", dishes, pot, Math.abs(leftOver));
    }
}