import java.util.ArrayList;

/**
 * Created by Lumpy on 02.06.2016.
 */
public class Max_Non_Negativ_SubArray {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(756898537);
        test.add(-1973594324);
        test.add(-2038664370);
        test.add(-184803526 );
        test.add(1424268980);

        System.out.println(maxset(test));


    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {

        ArrayList<Integer> subArray = new ArrayList<>();
        ArrayList<Integer> subArray2 = new ArrayList<>();

        long sumSub1 = 0;
        long sumSub2 = 0;
        boolean once = false;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) < 0){
                if(sumSub2 <= sumSub1){
                    sumSub2 = sumSub1;
                    subArray2 = subArray;
                    once = true;
                }
                subArray = new ArrayList<>();
                sumSub1 = 0;

            }else {
                subArray.add(a.get(i));
                sumSub1 += a.get(i);

            }
        }

        if(subArray2.size() == 0){
            if (subArray.size() == 0)
                return new ArrayList<>();
            else
                if(once == true)
                    return subArray;
        }

        if(sumSub2 > sumSub1){
            return subArray2;
        }
        if(sumSub1 == sumSub2){
            if(subArray.size() < subArray2.size()){
                return subArray2;
            }else if(subArray.size() > subArray2.size()){
                return subArray;
            }else{
                if(subArray.get(0) > subArray2.get(0))
                    return subArray2;
            }
        }
        return subArray;
        }
}
