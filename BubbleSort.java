import java.util.Scanner;
import java.util.Arrays;
class BubbleSort {
    public static void bubblesort(int[] arr){
        int n=arr.length;
        System.out.println("bubble sort");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements into array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSort.bubblesort(arr);
        System.out.println("sorted array:");
        for(int i=0;i< n;i++){
            arr[i]
        }
    }
}
