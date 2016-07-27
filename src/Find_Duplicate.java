import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lumpy on 11.06.2016.
 */
public class Find_Duplicate {
    public static void main(String[] args) {

        List<Integer>test = new ArrayList<>();

        test.add(3);
        test.add(4);
        test.add(1);
        test.add(4);
        test.add(1);
        System.out.println(findDuplicate(test));

    }
    public static int findDuplicate (final List<Integer> a){

        Map<Integer, Integer> map = new HashMap<>();

        for(int test : a){
            if(map.get(test) == null)
                map.put(test, test);
            else
                return test;

        }
        return 0;
    }
}
