/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Main class.
 */
public class ReclamationProject {

    /**
     * @param args main
     */
    public static void main(final String[] args) {
        System.out.println(doit("Horero", "Wdored"));
    }
    /**
     * @param a is string 1
     * @param b is string 2
     * @return The longest matching substring between a and b
     */
    static String doit(final String a, final String b) {
        String result = "";
        String filteredInput1 = a;
        String filteredInput2 = b;
        if (a.length() < a.length()) {
            String temp = a;
            filteredInput1 = b;
            filteredInput2 = temp;
        }

        /*
         * For loop with i
         */
        for (int i = 0; i < filteredInput1.length(); i++) {
            for (int j = filteredInput1.length() - i; j > 0; j--) {
                for (int k = 0; k < filteredInput2.length() - j; k++) {
                    if (filteredInput1.regionMatches(i, filteredInput2, k, j)
                            && j > result.length()) {
                        result = filteredInput1.substring(i, i + j);
                    }
                    // Do it!

                }
            } // Ah yeah
        }
        return result;
    }
}
