/******************************************************************************
 *  Compilation:  javac Binomial.java
 *  Execution:    java Binomial N K
 *
 *  Compute binomial(N, K) using Pascal's identity
 *
 *        binomial(n, k) = binomial(n-1, k-1) + binomial(n-1, k)
 *
 *  and dynamic programming.
 *
 *  % java Binomial 10 2
 *  45
 * 
 *  % java Binomial 20 0
 *  1
 * 
 *  % java Binomial 50 20
 *  47129212243960
 * 
 *  % java Binomial 0 0      
 *  1                           // by definition
 * 
 *  % java Binomial 100 15
 *  253338471349988640
 *
 ******************************************************************************/

public class Binomial {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        long[][] binomial = new long[n+1][k+1];

        // base cases
        for (int i = 0; i <= n; i++) binomial[i][0] = 1;
        for (int j = 1; j <= k; j++) binomial[0][j] = 0;

        // bottom-up dynamic programming
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= k; j++)
                binomial[i][j] = binomial[i-1][j-1] + binomial[i-1][j];

        StdOut.println(binomial[n][k]);

    }
}

