import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int kilogramFood = Integer.parseInt(scanner.nextLine());
        double foodDog = Double.parseDouble(scanner.nextLine());
        double foodCat = Double.parseDouble(scanner.nextLine());
        double foodTurtul = Double.parseDouble(scanner.nextLine());
        double allFood = (foodCat+foodDog+(foodTurtul/1000))*days;
        double diff = Math.abs(kilogramFood-allFood);
        if(kilogramFood<allFood){
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
        }else{
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        }

    }
}
