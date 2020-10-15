import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());
        double allMoney = (a*3.25+b*4+c*3.5+d*8)*0.95;
        if(presentPrice<=allMoney){
            System.out.printf("She is left with %.0f leva.",Math.floor(allMoney-presentPrice));
        }else{
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice-allMoney));
        }
    }
}
