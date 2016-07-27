/**
 * Created by Lumpy on 06.06.2016.
 */
public class Power_Of_Two_Integers {
    public static void main(String[] args) {
        System.out.println(isPower(1));
    }

    public static boolean isPower(int a){

        if(a==0) return false;
        if(a == 1)return true;
        for(int i = 2; i < a; i++){
            for(int x = 2; x < a; x++) {
                double zwischen =Math.pow(i, x);
                if((int)zwischen == a)
                    return true;
                else if(zwischen > a){
                    break;
                }
            }

        }
        return false;

    }
}
