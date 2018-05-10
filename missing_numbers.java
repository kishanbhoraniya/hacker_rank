import java.io.*;
import java.util.*;

public class Solution {

    static void missingNumbers(int[] arr, int[] brr) {
        int[] res = new int[100];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            res[arr[i]-min]--;
        }
        for(int i=0;i<brr.length;i++){
            res[brr[i]-min]++;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
                while(res[i]>0){
                    System.out.print((i+min)+" ");
                    res[i]--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        missingNumbers(arr, brr);
        in.close();
    }
}
