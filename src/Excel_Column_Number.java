/**
 * Created by Lumpy on 03.06.2016.
 */
public class Excel_Column_Number {
    public static void main(String[] args) {
        System.out.println(convert(28));

    }

    public static String convert(int n){
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append((char)('A' + (n - 1) % 26));
            n = (n - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
