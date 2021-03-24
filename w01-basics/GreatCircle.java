public class GreatCircle {
    public static void main(String[] args) {
        
        // Mean radius of Earth
        double r = 6371.0;

        // Coordinates from the user converted to radians
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double a, b, distance;

        // Haversine formula
        a = Math.pow(Math.sin((x2 - x1) / 2), 2);
        b = Math.pow(Math.sin((y2 - y1) / 2), 2);
        distance = 2*r * Math.asin(Math.sqrt(a + Math.cos(x1) * Math.cos(x2) * b));

        System.out.println(distance + " kilometers");
    }
}
