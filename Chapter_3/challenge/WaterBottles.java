package Chapter_3.challenge;

public class WaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {
        var bottlesDrank = 0;
        var emptyBottles = 0;
        do {
            bottlesDrank += numBottles;
            // drink the bottles
            emptyBottles += numBottles;
            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        } while (numBottles >= 1);
        return bottlesDrank;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
        System.out.println(numWaterBottles(15, 4));
    }

}
