package DSA_Problems;
import java.util.Scanner;
public class Parking {
    public static int Plot(String arr){
        int maxCount = 0, currentCount = 0;
        
        for (char c : arr.toCharArray()) {
            if (c == 'S') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        
        return maxCount;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the parking lot string: ");
        String arr = sc.next();
        System.out.println("Maximum cars that can be parked consecutively: " + Plot(arr));


    }
}