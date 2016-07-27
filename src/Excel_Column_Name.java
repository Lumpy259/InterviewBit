/**
 * Created by Lumpy on 03.06.2016.
 */
public class Excel_Column_Name {
    public static void main(String[] args) {
        System.out.println(number("AZA"));
    }

    public static int number(String s){
        if (s == null)
            return 0;
        int result = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = (int)s.charAt(i) - 64;
            result = result + (c * (int)Math.pow(26, j));
            j++;
        }
        return result;


    }

}
