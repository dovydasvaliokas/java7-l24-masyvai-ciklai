import java.util.Arrays;
import java.util.Scanner;

public class MasyvoNuskaitymasIsKonsoles {
    public static void main(String[] args) {
        double[] skaiciai = masyvoNuskaitymasIsKonsoles();

        System.out.println("skaiciai = " + Arrays.toString(skaiciai));


    }

    /**
     * Funkcija nuskaito ir išsaugo masyvą iš konsolės.
     * @return nuskaitytą double[] masyvą
     */
    public static double[] masyvoNuskaitymasIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite kiek skaičių bus masyve: ");
        int n = skaitytuvas.nextInt();

        double[] masyvas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite masyvo " + i + " skaičių");
            masyvas[i] = skaitytuvas.nextDouble();
        }
        return masyvas;
    }
}
