public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        int[] thSeq = new int[n];

        thSeq[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) 
                thSeq[i] = thSeq[i / 2];
            else
                thSeq[i] = 1 - thSeq[i - 1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thSeq[i] == thSeq[j])
                    System.out.print("+  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
