public class CMYKtoRGB {
    public static void main(String[] args) {
        
        // User input
        double cyan    = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow  = Double.parseDouble(args[2]);
        double black   = Double.parseDouble(args[3]);

        long white, red, green, blue;

        white = Math.round((1 - black));
        red   = Math.round(255 * white * (1 - cyan));
        green = Math.round(255 * white * (1 - magenta));
        blue  = Math.round(255 * white * (1 - yellow));

        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}
