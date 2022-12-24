public class med {

    public static void main(String[] args) {
        int[][] x = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
        int[][] y = {{ 2, 4, 5}, {6, 8, 5}, {10, 15, 20}};

        int[][] sum = new int[3][3];
        int i, j;

        System.out.println("\nAdd\tSub\tMul\tDiv\tMod");

        for(i = 0; i < x.length; i++)
        {
            for(j = 0; j < x[0].length; j++)
            {
                System.out.format("%d \t", (x[i][j] + y[i][j]));
                System.out.format("%d \t", (x[i][j] - y[i][j]));
                System.out.format("%d \t", (x[i][j] * y[i][j]));
                System.out.format("%d \t", (x[i][j] / y[i][j]));
                System.out.format("%d \t", (x[i][j] % y[i][j]));
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

