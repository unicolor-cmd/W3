package h2;

public class H2_main {
    public static void main(String[] args) {

        int jahr = 0;
        boolean schalt = false;

        boolean divisibleBy4 = (jahr % 4 == 0);
        boolean divisibleBy100 = (jahr % 100 == 0);
        boolean divisibleBy400 = (jahr % 400 == 0);

        schalt = (divisibleBy4 && (!divisibleBy100 || divisibleBy400));

    }
}
