import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lumpy on 17.06.2016.
 */
public class Interger_to_Roman {
    public static void main(String[] args) {
        System.out.println(toRoman(99));

    }
    public static String toRoman(int a){

        String output = "";
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(0,1);
        map2.put(1,4);
        map2.put(2,5 );
        map2.put(3,9);
        map2.put(4,10 );
        map2.put(5,50 );
        map2.put(6,100 );
        map2.put(7,500 );
        map2.put(8,1000);

        for(int i = map2.size()-1; i > -1; i--) {
            if (a / map2.get(i) > 0) {
                int test = a / map2.get(i);
                for (int x = 0; x < test; x++)
                    output+=(map.get(map2.get(i)));
                a -= map2.get(i)*test;
            }
        }


        return output;

    }

}
