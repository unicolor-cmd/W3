package h3;

public class H3_main {
    public static void main(String[] args) {

        int max = 0, fix = 0, wartend = 0;
        boolean istVoll = false;

        int frei = max - fix; // Anzahl freier Fixplätze
        int zuweisbar = (frei >= wartend) ? wartend : frei; // Anzahl Wartender denen Fixplatz zugewiesen werden kann

        fix += zuweisbar;
        wartend -= zuweisbar;

        istVoll = (max == fix);
    }
}
