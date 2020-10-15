import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());
        int dreams = 30000;
        int wtf = (365 - holidays) * 63 + (holidays * 127);
        int difference = Math.abs(wtf - dreams);
        int hours = difference / 60; //since both are ints, you get an int
        int minutes = difference % 60;

        if (wtf > dreams) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %02d minutes more for play", hours, minutes);
        } else if(wtf<=dreams) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %02d minutes less for play", hours, minutes);
        }


    }
}
