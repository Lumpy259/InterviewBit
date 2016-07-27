import java.util.*;

/**
 * Created by Lumpy on 27.07.2016.
 */
public class Single_Number {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(3);
        test.add(5);
        test.add(5);
        test.add(1);
        System.out.println(singleNumber(test));


    }

    public static int singleNumber(final List<Integer> a) {
        int result = 0;
        for(int i = 0;i<a.size();i++){
            result = result ^ a.get(i);
        }
        return result;
    }

}


