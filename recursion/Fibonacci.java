package recursion;

public class Fibonacci {

    public static int fibo(int n){
        if(n==1 ||n==0){
            return n;
        }
        else{
            int result=fibo(n-1)+fibo(n-2);
            return result;
        }

        

    }
    public static void main(String[] args) {
        System.out.println(fibo(6));
        
        
        
    }
}
