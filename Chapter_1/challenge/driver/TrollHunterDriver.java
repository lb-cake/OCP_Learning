package Chapter_1.challenge.driver;

import Chapter_1.challenge.Disemvoweler;

public class TrollHunterDriver {

    public static void main(String[] args) {
        Disemvoweler trollHunter = new Disemvoweler();
        System.out.println(trollHunter.disemvowel(args[0]));
    }
}
