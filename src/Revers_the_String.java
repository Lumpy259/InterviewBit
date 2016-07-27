import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lumpy on 26.07.2016.
 */
public class Revers_the_String {
    public static void main(String[] args) {

        System.out.println(reverseWords("  the sky is blue  "));

    }

    public static String reverseWords(String a) {
        String[] test;
        test = a.split(" ");
        String outString = "";
        for(int i = test.length-1; i >= 0; i--){
            if(!test[i].equals(" ") && !test[i].equals("")){
                if(outString.equals("")) outString = test[i];
                else
                outString = outString+" "+test[i];
            }
        }
        return outString;
    }
}
