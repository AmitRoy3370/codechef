
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Similar_Heights {
    
    static Scanner in = new Scanner(System.in);
    
    static StringBuilder ans = new StringBuilder();
    
    static int testCases, n;
    
    static long a[];
    
    static void solve(int t) {
        
        counter count = new counter();
        
        long max = 0;
        
        for (long i : a) {
            
            count.adder(i);
            
            max = Math.max(max, i);
            
        }
        
        long res = 0;
        long maxcnt = 0;
        
        Map<Long, Integer> map = count.map;
        
        for (long i : map.keySet()) {
            
            if (map.get(i) == 1) {
                
                res++;
                
            }
            
            maxcnt = Math.max(maxcnt, map.get(i));
            
        }
        
        if (res % 2 == 1) {
            
            long y = (res + 1L) / 2L;
            
            if (count.count(max) == 1) {
                // y++; 
                if (maxcnt == 2) {
                    y++;
                }
            
            }
            
            ans.append(y);
        
        } else {
            
            long y = res / 2L;
            ans.append(y);
        
        }
        
        if (t != testCases) {
            
            ans.append("\n");
            
        }
        
    }
    
    public static void main(String[] amit) {
        
        testCases = in.nextInt();
        
        for (int t = 0; t < testCases; ++t) {
            
            n = in.nextInt();
            
            a = new long[n];
            
            for (int i = 0; i < n; ++i) {
                
                a[i] = in.nextLong();
                
            }
            
            solve(t + 1);
            
        }
        
        System.out.print(ans.toString());
        
    }
    
    static void print(long a[]) {
        
        for (long i : a) {
            
            System.out.print(i + " ");
            
        }
        
        System.out.println();
        
    }
    
    static class counter {
        
        Map<Long, Integer> map = new HashMap<>();
        
        void adder(long i) {
            
            map.put(i, map.getOrDefault(i, 0) + 1);
            
        }
        
        int count(long i) {
            
            return (map.containsKey(i) ? map.get(i) : 0);
            
        }
        
    }
    
}
/*

5
4
1 3 2 4
3
3 2 1
2
2 1
3
2 1 3
6
3 2 1 6 4 5

 */
