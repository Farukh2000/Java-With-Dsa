package recursion;

public class First {

    
    public static void  PrintNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNum(n-1);

        
    }
    public static void main(String[] args) {
        PrintNum(8);
        
    }
}
