package h1;

public class H1_main {
    public static void main(String[] args) {

        double guthaben = 0.0;
        double monEingang = 0.0;
        int rating = 0;
        boolean warnhinweis = false;
        boolean negativ = false;

        negativ = (guthaben < 0);
        warnhinweis = false;

        if (guthaben > 0) {
            rating += 3;
        } else if (guthaben == 0) {
            rating += 2;
        } else {
            if (monEingang * monEingang >= guthaben * guthaben) {
                rating += 1;
            } else {
                rating -= 1;
                warnhinweis = (rating < 0);
            }
        }
    }
}
