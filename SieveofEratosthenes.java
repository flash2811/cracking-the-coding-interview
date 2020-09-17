public class SieveofEratosthenes {
    private static boolean[] sieveOfEratosthenes(int max) {
        boolean[] prime = new boolean[max + 1];
        int count = 0;

        // make all values true
        for(int i = 0; i < max; i++) {
            prime[i] = true;
        }

        for(int p = 2; p*p <= max; p++) {
            if(prime[p]) {
                for(int i = p*p; i <= max; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }

    public static void main (String args[]) {
        int max = 10;

        boolean prime[] = sieveOfEratosthenes(max);

        for(int i = 2; i <= max; i++) {
            if(prime[i]) {
                System.out.println(i + " ");
            }
        }

    }
}
