/**
 * Created by Lumpy on 05.06.2016.
 */
public class Trailing_Zeros_in_Factorial {
    public static void main(String[] args) {

        System.out.println(trailingZeros(100));

    }

    public static int trailingZeros(int a){

        int count = 0;
        for (int i=5; a/i>=1; i *= 5)
            count += a/i;

        return count;

    }
}
