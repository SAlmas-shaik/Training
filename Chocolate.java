
package DSA_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Chocolate{
    public static int FindDifference(int[] arr,int n,int m){
        if(m==0 || n==0){
            return 0;
        }
        Arrays.sort(arr);
        if(n<m){
            return -1;
        }
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The number of People:");
        int m=sc.nextInt();
        System.out.println(FindDifference(arr,n,m));

    }
}
