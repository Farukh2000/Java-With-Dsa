import java.util.Arrays;
import java.util.Scanner;

//timeComplexity (n^2)

public class Selection {
    public static void SeleSort(int n,int arr[]){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={7,8,1,3,8,9,11,5};
        int n=arr.length;
        SeleSort(n, arr);
        
    }
}
