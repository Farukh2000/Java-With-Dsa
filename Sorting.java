import java.util.Arrays;
import java.util.Scanner;

// buble sort

public class Sorting{

    public static void BubbleSort(int n, int arr[]){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
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
        BubbleSort(n, arr);
        System.out.println("hello");
    }
}