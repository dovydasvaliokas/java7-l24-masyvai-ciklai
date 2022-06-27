public class WhileCiklas {
    public static void main(String[] args) {
        skaiciuIsvedimasNuoNulio(50);

    }

    public static void skaiciuIsvedimasNuoNulio(int ikiKelinto) {
        int x = 0;
        while (x < ikiKelinto) {
            System.out.println("x = " + x++);
        }
    }
}
