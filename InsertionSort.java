import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void InSort(int n, int arr[]){
        for(int i=0; i<n; i++){
            int current =arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;

                
            }
            //placement 
            arr[j+1]=current;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       

        int arr[]={8,3,5,3,2};
        int n=arr.length;

        
        InSort(n, arr);
        
    }
}
