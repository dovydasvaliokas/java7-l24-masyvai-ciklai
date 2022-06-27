import java.util.Arrays;
import java.util.Scanner;

/**
 * NEBAIGTAS IR NELABAI VEIKIANTIS PAVYZDYS
 */
public class DvimaciaiMasyvai {
    public static void main(String[] args) {
        char[][] namoPlanas = dvimacioMasyvoNuskaitymas();
        System.out.println("namoPlanas = " + Arrays.deepToString(namoPlanas));
    }



    static public char[][] dvimacioMasyvoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite ilgį: ");
        int eilutes = skaitytuvas.nextInt();
        System.out.println("Įveskite plotį: ");
        int stulpeliai = skaitytuvas.nextInt();

        char[][] masyvas = new char[eilutes][stulpeliai];

        for (int i = 0; i < eilutes; i++) {
            for (int j = 0; j < stulpeliai; j++) {
                masyvas[i][j] = skaitytuvas.next().charAt(0);
            }

        }

        return masyvas;
    }


}
