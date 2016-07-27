/**
 * Created by Lumpy on 04.06.2016.
 */
public class Reverse_Integer {

    public static void main(String[] args) {


        System.out.println(isPalindrome(-1146467285));

    }

    public static int isPalindrome(int a){

        String test = String.valueOf(a);
        String out = "";
        boolean negativ = false;

        if(test.startsWith("-")){
            out += "-";
            negativ = true;
        }

        for(int i = test.length()-1; i > -1; i--){
            out += test.charAt(i);
        }

        if(negativ)
            out = out.substring(0, out.length()-1);

        long outInt;
        outInt = Long.valueOf(out);

        if(outInt > Integer.MAX_VALUE || outInt < Integer.MIN_VALUE) return 0;

        return (int) outInt;
    }
}
