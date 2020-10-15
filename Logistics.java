import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lists = Integer.parseInt(scanner.nextLine());
        int weight = 0;
        int price = 0;
        double totalWeight=0;
        int counterBus = 0;
        int counterTruck = 0;
        int counterTrain = 0;
        int weightBus = 0;
        int weightTruck = 0;
        int weightTrain = 0;

        double averagePrice = 0;

        for (int i = 0; i <lists ; i++) {
            weight = Integer.parseInt(scanner.nextLine());
            totalWeight+=weight;
            if (weight<=3){
                weightBus+=weight;
                counterBus++;
            }else if(weight>3 && weight<=11){
                weightTruck+=weight;
                counterTruck++;
            }else if(weight>11){
                weightTrain+=weight;
                counterTrain++;
            }
averagePrice=(weightBus*200+weightTruck*175+weightTrain*120)/totalWeight;

        }
        System.out.printf("%.2f",averagePrice);
        System.out.printf("%n%.2f",weightBus/totalWeight*100);
        System.out.print("%");
        System.out.printf("%n%.2f",weightTruck/totalWeight*100);
        System.out.print("%");
        System.out.printf("%n%.2f",weightTrain/totalWeight*100);
        System.out.print("%");

    }
}
