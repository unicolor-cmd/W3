package p3;

public class P3_main {
    public static void main(String[] args) {

        int a = 0; // vorgegebene Zahl

        // 1. Teilaufgabe
        if (a < 0) {
            System.out.println(-a);
        } else {
            System.out.println(a);
        }

        // 2. Teilaufgabe
        System.out.println(a * a);

        // 3. Teilaufgabe
        if (a % 2 == 0) {
            System.out.println("a ist gerade");
        } else {
            System.out.println("a ist ungerade");
        }
    }
}
