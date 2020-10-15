import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double students = Double.parseDouble(scanner.nextLine());
        double grades = 0;
        int counterPoor = 0;
        int counterMid = 0;
        int counterGood = 0;
        int counterExcellent = 0;
        double averageScore = 0;
        double allStats = 0;
        for (int i = 0; i < students; i++) {
            grades = Double.parseDouble(scanner.nextLine());
            if (grades >= 5) {
                counterExcellent++;
                allStats += grades;
            } else if (grades >= 4 && grades < 5) {
                counterGood++;
                allStats += grades;
            } else if (grades >= 3 && grades < 4) {
                counterMid++;
                allStats += grades;
            } else if (grades < 3) {
                counterPoor++;
                allStats += grades;
            }
            averageScore = allStats / students;
        }
        System.out.printf("Top students: %.2f",counterExcellent/students*100);
        System.out.print("%");
        System.out.printf("%nBetween 4.00 and 4.99: %.2f",counterGood/students*100);
        System.out.print("%");
        System.out.printf("%nBetween 3.00 and 3.99: %.2f",counterMid/students*100);
        System.out.print("%");
        System.out.printf("%nFail: %.2f",counterPoor/students*100);
        System.out.print("%");
        System.out.printf("%nAverage: %.2f", averageScore);
    }
}
