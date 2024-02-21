public class FindPow1 {
    // spaceComp(n)

    public static int PowFind(int a, int b){
        if(b==1){
            return a;
        }
        else if(b==0){
            return 1;
        }
        else if(b%2==0){
            return PowFind(a, b/2)* PowFind(a, b/2);
        }
        else{
            return PowFind(a, b/2)* PowFind(a, b/2)* a;
        }
    }
    public static void main(String[] args) {
        System.out.println(PowFind(3,3));

        
    }
}
