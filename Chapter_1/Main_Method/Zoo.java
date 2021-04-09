package Chapter_1.Main_Method;

public class Zoo {
    /**
     * Java doc example
     * @author Will Parks
     * @param args description about the parameter
     * @return description about the thing being returned
     */
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);


        /*
        in the cli...
        java Zoo Bronx Zoo
        -----Output-----
        Hello from the Brooklyn Zoo!
        Bronx Zoo
        */

        /*
        java Zoo.java "San Diego" Zoo
        ----Output----
        San Diego
        Zoo
         */

        /*
        java Zoo.java San Diego Zoo
        ----Output----
        San
        Diego

        ...and the third parameter is ignored.
         */
    }
}