import java.util.Scanner;

public class Sorting{

    public static void BubbleSort(int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[i]>arr[i+1])

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Size of array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter array elements");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    }
}