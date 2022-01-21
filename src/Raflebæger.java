import java.util.Random;

public class Raflebæger {
    private final int[] terninger;

    public Raflebæger(int antalTerninger) {
        terninger = new int[antalTerninger];
    }




    public void ryst() {
        Random rd = new Random();
        for (int i = 0; i < terninger.length; i++) {
            int terning;
            terning = rd.nextInt(6) + 1;
            terninger[i] = terning;
        }
    }

    public void se() {
        System.out.println("Du slog: ");
        for (int i = 0; i < terninger.length; i++) {
            System.out.print(terninger[i] + " ");
        }
        System.out.println();
    }
}
