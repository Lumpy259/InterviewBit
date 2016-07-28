import java.util.ArrayList;

/**
 * Created by Lumpy on 28.07.2016.
 */
public class Longest_common_Prefix {

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();

        test.add("abcdefgh");
        test.add("aefghijk");
        test.add("abcefgh");
        System.out.println(longestCommonPrefix(test));

    }


    public static String longestCommonPrefix(ArrayList<String> a) {

        if(a.size() == 1) return a.get(0);

        String first = a.get(0);
        String last = a.get(a.size()-1);

        String value = "";

        int length1 = last.length();
        int length2 = first.length();

        if(first.length() >= last.length()){
           for(int i = 0; i < length1; i++) {
               if(first.contains(last)) value = last;
               else
                   last=last.substring(0, last.length()-1);
           }
        }
        else{
            for(int i = 0; i < length2; i++) {
                if(last.contains(first)) value = first;
                else
                    first=first.substring(0, first.length()-1);
            }
        }

        for(int i = 0; i < a.size()-1; i++){
            if(!a.get(i).contains(value))   {
                value = value.substring(0, value.length()-1);
                i--;
            }

        }
        return value;
    }
}
