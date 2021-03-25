public class BandMatrix {
    public static void main(String[] args) {
        int n     = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        
        int distance = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                distance = Math.abs(col - row);
                if (distance > width) {
                    System.out.printf("0  ");
                } else {
                    System.out.printf("*  ");
                }
            }
            System.out.println("\n");
        }
    }
}
