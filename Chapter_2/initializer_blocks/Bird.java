package Chapter_2.initializer_blocks;

public class Bird {
    public static void main(String[] args) {
        { System.out.println("Feathers"); }
    }
    {
        System.out.println("Snowy");
    }
}
