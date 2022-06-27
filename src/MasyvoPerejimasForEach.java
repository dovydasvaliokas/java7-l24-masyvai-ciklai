import java.util.Arrays;
import java.util.Scanner;

public class MasyvoPerejimasForEach {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        String[] zodziai = masyvoNuskaitymasIsKonsoles(skaitytuvas);
        System.out.println("zodziai = " + Arrays.toString(zodziai));

        String ieskomasZodis = nuskaitoIeskomaZodi(skaitytuvas);
        System.out.println("ieskomasZodis = " + ieskomasZodis);

        System.out.println("arYraZodisMasyve(zodziai, ieskomasZodis) = " + arYraZodisMasyve(zodziai, ieskomasZodis));

    }

    /**
     * Funkcija nuskaito masyvą iš konsolės
     * @param skaitytuvas scanner objektas iš kur skaityti (iš konsolės)
     * @return String[] tipo masyvą (žodžių masyvą)
     */
    public static String[] masyvoNuskaitymasIsKonsoles(Scanner skaitytuvas) {
        System.out.println("Įveskite kiek žodžių bus masyve: ");
        int n = skaitytuvas.nextInt();

        String[] masyvas = new String[n];

        skaitytuvas.nextLine();             // nuskaitęs skaičių prieš skaitant žodžius reikia "nudeginti" eilutę
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite masyvo " + i + " žodį");
            masyvas[i] = skaitytuvas.nextLine();
        }
        return masyvas;
    }

    /**
     * Funkcija nuskaito vieną žodį iš konsolės
     * @param skaitytuvas scanner objektas iš kur skaityti (iš konsolės)
     * @return String tipo kintamąjį - vieną (ieškomą) žodį, kurio ieškos masyve.
     */
    public static String nuskaitoIeskomaZodi(Scanner skaitytuvas) {
        System.out.println("Įveskite ieškomą žodį: ");
        return skaitytuvas.nextLine();
    }

    /**
     * Funkcija suranda ar žodis yra masyve.
     * @param masyvas kur ieškome
     * @param ieskomasZodis ką ieškome
     * @return grąžina true, jei žodis yra masyve; grąžina false, jei žodžio nėra masyve
     */
    public static boolean arYraZodisMasyve(String[] masyvas, String ieskomasZodis) {
        for (String elementas : masyvas) {
            if (ieskomasZodis.equals(elementas)) {
                return true;
            }
        }
        return false;
    }
}
