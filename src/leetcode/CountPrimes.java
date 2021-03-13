package leetcode;/**
* @program: LeetCode
*
* @description: 204
 *
 * Count the number of prime numbers(质数) less than a non-negative number, n.
 *
 * Example 1:
 *
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * Example 2:
 *
 * Input: n = 0
 * Output: 0
 * Example 3:
 *
 * Input: n = 1
 * Output: 0
* @author: Keyang Wang
* @create: 2021-03-13 20:04
**/
public class CountPrimes{
    public int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
           if (isPrime(i)){
               ans++;
           }
        }
        return ans;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        int n =10;
        System.out.println(countPrimes.countPrimes(n));
    }
}
