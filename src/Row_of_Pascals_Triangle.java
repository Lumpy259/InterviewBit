import java.util.ArrayList;

/**
 * Created by Lumpy on 26.05.2016.
 */
public class Row_of_Pascals_Triangle {

    public static void main(String[] args) {


        System.out.println(triangle(10));

    }

    public static ArrayList<Integer> triangle(int deep){

        ArrayList<Integer> list = new ArrayList<>();

        if (deep != 0) list.add(1);
        list.add(1);

        for(int i = 1; i < deep; i++){
            ArrayList<Integer> inner = new ArrayList<>(list);

            for(int j = 1; j < list.size(); j++){
                inner.add(j, list.get(j - 1) + list.get(j));

            }
            if(i >= 2){
                for(int x = i-1; x > 0; x--)
                inner.remove(inner.size()-1-x);
            }
            list = inner;


        }
        return list;




    }
}
