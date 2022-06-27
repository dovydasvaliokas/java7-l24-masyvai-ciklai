public class WhileCiklas {
    public static void main(String[] args) {
        skaiciuIsvedimasNuoNulio(50);

    }

    /**
     * Funkcija išveda visus sveikus skaičius nuo nulio iki kažkokio skaičiaus naudojant while ciklą
     * @param ikiKelinto iki kelinto skaičiaus išvesti
     */
    public static void skaiciuIsvedimasNuoNulio(int ikiKelinto) {
        int x = 0;
        while (x < ikiKelinto) {
            System.out.println("x = " + x++);
        }
    }
}
