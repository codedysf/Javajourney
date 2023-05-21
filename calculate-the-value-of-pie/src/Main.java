public class Main {
    public static void main(String[] args) {
        int terms = 200000;
        double pi = 0.0;
        boolean found = false;
        int firstMatchTerms = 0;

        for (int i = 0; i < terms; i++) {
            int denominator = 2 * i + 1;
            if (i % 2 == 0) {
                pi += 4.0 / denominator;
            } else {
                pi -= 4.0 / denominator;
            }

            if (!found && String.valueOf(pi).startsWith("3.14159")) {
                found = true;
                firstMatchTerms = i + 1;
            }
        }

        System.out.println("Approximation of pi using " + terms + " terms: " + pi);
        System.out.println("Number of terms before first match with 3.14159: " + firstMatchTerms);
    }
}
