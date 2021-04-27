package Chapter_2.reading_writing_member_fields;

public class Literals {
    double hardToReadMilli = 1000000;
    double aMilli = 1_000_000;

//    double notAtStart = _1000.00; // DOES NOT COMPILE
//    double notAtEnd = 1000.00; // DOES NOT COMPILE
//    double notByDecimal = 1000_.00; // DOES NOT COMPILE
    double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
    double reallyUgly = 1_____2; // Also compiles
}
