public class RecursionandDynamicPrgramming {

    // O(n^2)
    int fibonacci(int i) {
        if(i == 0)
            return 0;
        if(i == 1)
            return 1;
        return fibonacci(i - 1) + fibonacci(i -2);
    }

    // O(n)
    int fibonacci2(int n) {
        return fibonacci(n, new int[n + 1]);
    }

    int fibonacci(int i, int[] memo) {
        if(i ==0 || i == 1)
            return 1;
        if(memo[i] == 0) {
            memo[i] = fibonacci(i -1, memo) + fibonacci(i -2, memo);
        }
        return memo[i];
    }
}
