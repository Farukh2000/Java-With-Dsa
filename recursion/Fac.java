package recursion;

public class Fac {

   

    public static int Factorial(int n){
    
        if(n==1){
            return 1;
        }
        int fac=n*Factorial(n-1);
        return fac;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    
    }
}
