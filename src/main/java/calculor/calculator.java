package calculor;

public class calculator  {


    public static int sub(int a, int b){
        return a + b ;
    }
    public static int minus(int a, int b){
        return a - b ;
    }
    public static int multiply(int a, int b){
        return a*b ;
    }
    public static double divide(double a, double b){
        if (b ==0){
            throw new IllegalArgumentException("impossible de diviser par zero");
        }
        return a/b ;
    }



}
