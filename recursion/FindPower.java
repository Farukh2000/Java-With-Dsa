package recursion;

public class FindPower {

    // spaceComp(n)

    public static int PowFind(int a, int b){
        if(b==1){
            return a;
        }
        else if(b==0){
            return 1;
        }
        else{
            int result=a*PowFind(a, b-1);
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(PowFind(3,3));

        
    }
}
