package Chapter_3.short_circuit;

public class NullPointerPossibility {
    class Duck {
        int num = 5;
        public int getNum() {return num;}
    }
    public void npeMaybe() {
        Duck duck = null;
        if (duck != null & duck.getNum() < 5) { }

        if (duck != null && duck.getNum() < 5) { }
    }
}
