import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double workTime = Math.floor(days*8*0.9)+(workers*2*days);

        if(workTime>=hours){
            System.out.printf("Yes!%.0f hours left.", workTime-hours);
        }else {
            System.out.printf("Not enough time!%.0f hours needed.",hours-workTime);
        }


    }
}
