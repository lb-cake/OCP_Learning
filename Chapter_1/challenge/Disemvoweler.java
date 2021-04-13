package Chapter_1.challenge;

/**
 * @author will
 *
 */
public class Disemvoweler {

    /**
     * @author will
     * @param comment - the unfiltered comment from the troll
     * @return a filtered comment without vowels
     */	
    public String disemvowel(String comment) {
        return comment.replaceAll("[AaEeIiOoUu]", "");
    }

}
