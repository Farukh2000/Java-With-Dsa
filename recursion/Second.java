package recursion;

public class Second {
    public static void PrintNum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
        
    }
    public static void main(String[] args) {
        PrintNum(1);
        
    }
}
