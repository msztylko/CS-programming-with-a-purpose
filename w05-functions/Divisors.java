public class Divisors {
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0)
            return 0;
        else if (b == 0)
            return Math.abs(a);
        
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        while (absA % absB != 0) {
            int temp = absA;
            absA = absB;
            absB = temp % absB;
        }
        return absB;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0)
            return  0;
        else 
            return (Math.abs(a) / gcd(a, b) * Math.abs(b));
    }

    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static int totient(int n) {
        if (n <= 0)
            return 0;
        
        int count = 0;
            
        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(n, i))
                count++;
        }
        return count ;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
        System.out.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
        System.out.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
        System.out.println("totient(" + a + ") = " + totient(a));
        System.out.println("totient(" + b + ") = " + totient(b));
    }
}
