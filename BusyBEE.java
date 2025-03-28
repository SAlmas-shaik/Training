
package DSA_Problems;
import java.util.*;
import java.util.Scanner;
public class BusyBee {
    
    public static void findPairs(int[] A, int N, int K) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if ((A[i] + A[j]) / 2.0 >= K) {
                    result.add("(" + A[i] + ", " + A[j] + ")");
                }
            }
        }
        
        if (result.isEmpty()) {
            System.out.println("No valid pairs found.");
        } else {
            System.out.println(String.join(" ", result));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int N = s.nextInt();
        int[] A = new int[N];
        
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        
        System.out.print("Enter the value of K: ");
        int K = s.nextInt();
        
        findPairs(A, N, K);
        
    }
}

