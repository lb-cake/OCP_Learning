package Chapter_2.variables;

import java.util.Arrays;

public class VarTime {
    // var tricky = "HelloWorld"; // Will not compile because it's not a local variable

    public void createLegend() {
        var name = "Soulja Boy";
        var willCrankThat = true;
        var yearsRelevant = Arrays.asList(2008, 2009, 2010, 2011, 2012);
    }

    public void reassignMe() {
        var number = 5;
        number = 6;
//        number = "seven"; // Will not compile because the compiler determed that "number" was of type, int


//        var vibeCheck = null; Will not compile as var can not be used with null
        var vibeCheck = "true";
        vibeCheck = null;
    }

    class Var {
        public void var() {}
    }

    public void varCheck() {
        var var = new Var();
        var.var();
    }

}
