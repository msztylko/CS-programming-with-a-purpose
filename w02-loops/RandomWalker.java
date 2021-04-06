public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        int distance = 0;
        int steps = 0;
        double chance;

        while (distance < r) {
            System.out.println("(" + x + ", " + y + ")");
            chance = Math.random();
            if      (chance <= 0.25) x++;
            else if (chance <= 0.5)  x--;
            else if (chance <= 0.75) y++;
            else                     y--;
            
            distance = Math.abs(x) + Math.abs(y);
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
