package Class;

public class SumaRecursiva {
    public static int Suma(int num){
        if(num <=0){
            int res = num;
            return res;
        }
        else{
            int res;
            res = res + num;
            return Suma(num-1);
        }
    }
}
