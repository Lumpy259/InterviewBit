/**
 * Created by Lumpy on 04.06.2016.
 */
public class Palindrome_Integer {
    public static void main(String[] args) {


        System.out.println(isPalindrome(1367631));

    }

    public static boolean isPalindrome(int a){
        if(a < 0) return false;
        if(a >= 0 && a <=9) return true;

        String test = String.valueOf(a);
        String out = "";

        for(int i = test.length()-1; i > -1; i--){
            out += test.charAt(i);
        }

        if(out.equals(test))return true;




    return false;
    }
}
