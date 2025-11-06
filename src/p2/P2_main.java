package p2;

public class P2_main {
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0, d = 0, e = 0;

        boolean e1 = (a == b);
        boolean e2 = (a == b || a == c);
        boolean e3 = (a + b >= c);
        boolean e4 = (a + b + c >= 100);

        d = 0;
        if (e1) d += 1;
        if (e2) d += 1;
        if (e3) d += 1;
        if (e4) d += 1;

    }
}
