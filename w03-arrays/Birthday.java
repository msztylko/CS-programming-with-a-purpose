public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double[] countArray = new double[n + 2];

        for (int i = 0; i < trials; i++) {
            boolean found = false;
            boolean twin[] = new boolean[n];
            int count = 0;
    
            while (!found) {
                double birthday = n * Math.random();
                int bday = (int) birthday;
                if (twin[bday]) {
                    found = true;
                    countArray [count] += 1.0;
                } else {
                    twin[bday] = true;
                    count++;
                }
            }
        }

        double fraction = 0.0;
        int i = 0;
            
        while (fraction < 0.5) {
            fraction += countArray[i] / trials;
            System.out.print(i + 1 + "\t" + (int) countArray[i] + "\t" + fraction);
            System.out.println();
            i++;
        }
    }
}
