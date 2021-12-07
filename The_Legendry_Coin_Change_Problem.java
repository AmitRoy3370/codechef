import java.util.Scanner;

public class The_Legendry_Coin_Change_Problem {

    static int total_weight,n;
    
    static int coins[];
    
    static Scanner in=new Scanner(System.in);
    
    static void solve(){
        
        int dp[]=new int[total_weight+1];
        
        dp[0]=1;
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=total_weight;j++){
                
                if(coins[i]<=j ){
                    
                    dp[j]+=dp[j-coins[i]];
                    
                }
                
            }
            
        }
        
        System.out.println(dp[total_weight]);
        
    }
    
    public static void main(String[] amit) {
        
        total_weight=in.nextInt();
        
        n=in.nextInt();
        
        coins=new int[n+1];
        
        for(int i=1;i<=n;i++){
            
            coins[i]=in.nextInt();
            
        }
            
        solve();
        
    }
    
}
/*

10 4
2 5 3 6

*/

/*

4 3
1 2 3


*/