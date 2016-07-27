/**
 * Created by Lumpy on 27.07.2016.
 */
public class Number_of_1_Bits {
    public static void main(String[] args) {

        System.out.println(numSetBits(11));

    }

    public static int numSetBits(long a) {
        int number = 0;

        for(int x = 32; x >= 0; x--){
            double z = Math.pow(2, x);
            if(a / z >= 1){
                number++;
                a = (long) (a - z);
            }
        }

        return number;

    }
}
