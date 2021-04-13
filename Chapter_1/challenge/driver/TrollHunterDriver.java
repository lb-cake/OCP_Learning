package Chapter_1.challenge.driver;

import Chapter_1.challenge.Disemvoweler;

public class TrollHunterDriver {

    public static void main(String[] args) {
        Disemvoweler trollHunter = new Disemvoweler();
        System.out.println(trollHunter.disemvowel("What's up nerds!"));
        System.out.println(trollHunter.disemvowel("Losers only post here LOL"));
    }
}
