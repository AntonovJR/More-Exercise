import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume = Double.parseDouble(scanner.nextLine());
        double pipeOne = Double.parseDouble(scanner.nextLine());
        double pipeTwo = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double workDone = (pipeOne+pipeTwo)*hours;
        if (volume<workDone){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours,Math.abs(volume-workDone));
        }else{
            pipeOne = (pipeOne*hours)/workDone*100;
            pipeTwo = (pipeTwo*hours)/workDone*100;
            volume = workDone/volume*100;

            System.out.printf("The pool is %.2f%%full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",volume,pipeOne,pipeTwo);

        }


    }
}
