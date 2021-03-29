public class Ordinal {
    public static String vonNeumann(int n) {
        if (n == 0) return "{}"; 
        String s = "";
        for (int i = 0; i < n-1; i++)
            s += vonNeumann(i) + ", ";
        return "{" + s + vonNeumann(n-1) + "}";
    } 


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(vonNeumann(n));
    }

}
