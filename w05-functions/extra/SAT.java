public class SAT {
    public static void main(String[] args) {
        double z = Double.parseDouble(args[0]);
        double v = Gaussian.cdf((z - 1019) / 209);
        StdOut.println(v);
    }
}
