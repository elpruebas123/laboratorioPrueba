public class primo {
    public static void main(String[] args) {
        int n = 29; // puedes cambiar el número
        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
    }
}