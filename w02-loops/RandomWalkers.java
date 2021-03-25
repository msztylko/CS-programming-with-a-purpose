public class RandomWalkers {
    public static void main(String[] args) {
        int r      = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        
        int x = 0, y = 0, distance = 0, steps = 0;

        int sumSteps = 0;
        for (int t = 0; t < trials; t++) {
            
            // Initialize simulation
            x = 0;
            y = 0;
            distance = 0;
            steps = 0;
            
            while (distance < r) {
                double chance = Math.random();
                if      (chance <= 0.25) x++;
                else if (chance <= 0.5)  x--;
                else if (chance <= 0.75) y++;
                else                     y--;
                
                steps++;
                distance = Math.abs(x) + Math.abs(y);
            }
            sumSteps += steps;
        }
        System.out.println("average number of steps = " + (double) sumSteps/trials);
    }
}
        
