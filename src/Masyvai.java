import java.util.Arrays;

public class Masyvai {
    public static void main(String[] args) {
        int[] skaiciai = {3, 5, 8};
        System.out.println("skaiciai = " + Arrays.toString(skaiciai));          // išvedu masyvą su Javos kūrėjų funkcija

        // Išvedu 1-ą masyvo elementą
        System.out.println("skaiciai[1] = " + skaiciai[1]);


        // Išvedu masyvą su savo funkcija
        isvestiMasyva(skaiciai);
        
        
        // Suskaičiuoju ir išvedu sumą
        int suma = masyvoSuma(skaiciai);
        System.out.println("suma = " + suma);
    }

    /**
     * Funkcija išveda masyvo skaičius į tą pačią eilutę atskirtus kableliais
     * @param masyvas skaičių masyvas
     */
    public static void isvestiMasyva(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + ", ");
        }
        System.out.println();
    }

    /**
     * Funkcija apskaičiuoja masyvo skaičių sumą
     * @param masyvas int skaičiai
     * @return int sumą
     */
    public static int masyvoSuma(int[] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        return suma;
    }
}
