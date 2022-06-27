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


    public static String nuskaitoIeskomaZodi(Scanner skaitytuvas) {
        System.out.println("Įveskite ieškomą žodį: ");
        return skaitytuvas.nextLine();
    }

    public static boolean arYraZodisMasyve(String[] masyvas, String ieskomasZodis) {
        for (String elementas : masyvas) {
            if (ieskomasZodis.equals(elementas)) {
                return true;
            }
        }
        return false;
    }
}
