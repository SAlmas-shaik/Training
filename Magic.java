package DSA_Problems;
import java.util.*;
import java.util.Scanner;
public class Magic {
    
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    // Function to generate prime numbers up to N
    public static List<Integer> generatePrimes(int N) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
    
    public static int countPrimeSums(int N) {
        List<Integer> primes = generatePrimes(N);
        int count = 0;
        int sum = 0;
        
        for (int prime : primes) {
            sum += prime;
            if (sum > N) break;
            if (isPrime(sum) && sum >= 3) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = a.nextInt();
        
        int result = countPrimeSums(N);
        System.out.println("Count of prime numbers satisfying the property: " + result);
        
    }
}
