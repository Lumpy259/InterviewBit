/**
 * Created by Lumpy on 11.06.2016.
 */
public class Unique_Paths {
    public static void main(String[] args) {

        System.out.println(uniquePaths(2, 2));


    }
    public static int uniquePaths(int a, int b) {

        int[][] paths = new int[a][b];

        for (int i = 0; i < a; i++) paths[i][0] = 1;
        for (int j = 0; j < b; j++) paths[0][j] = 1;

        for (int row = 1; row < a; row++)
            for (int col = 1; col < b; col++)
                paths[row][col] = paths[row - 1][col] + paths[row][col - 1];

        return paths[a - 1][b - 1];
    }
}
