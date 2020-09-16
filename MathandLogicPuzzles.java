public class MathandLogicPuzzles {
    
    // check if n is prime
    boolean primeNaive(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // a better solution
    boolean primeBetter(int n) {
        if(n < 2) {
            return false;
        }
        
        int sqrt = (int) Math.sqrt(n);
        
        for(int i = 2; i <= sqrt; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // other algorithms exists such as Sieve of Eratosthenes 
    
    // practice probabilities 
}
