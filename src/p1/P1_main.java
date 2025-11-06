package p1;

public class P1_main {
    public static void main(String[] args) {

        int wuerfel = 0;

        boolean gewonnen = false, verloren = false, unentschieden = false;

        if (wuerfel == 1) {
            gewonnen = true;
        } else if (wuerfel == 2) {
            verloren = true;
        } else if (wuerfel == 4) {
            gewonnen = true;
        } else if (wuerfel == 5) {
            unentschieden = true;
        }

        /*
        boolean gewonnen = (wuerfel == 1 || wuerfel == 4);
        boolean verloren = (wuerfel == 2);
        boolean unentschieden = (wuerfel == 5);
        */

        if gewonnen {
            System.out.println("Gewonnen!");
        } else if verloren {
            System.out.println("Verloren!");
        } else if unentschieden {
            System.out.println("Unentschieden!");
        }
    }
}
