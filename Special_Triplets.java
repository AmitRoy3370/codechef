
import java.util.Scanner;

public class Special_Triplets {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
int testCases=in.nextInt();
        
for(int t=0;t<testCases;t++){
    
    long n=in.nextLong();
    
    int count=0;
    
    for (int C = 1; C <= n; C++)
        {
            for (int B = C; B <= n; B += C)
            {
                if (B % C == 0)
                {
                    for (int A = C; A <= n; A += B)
                    {
                        if (A % B == C)
                        {
                            count++;
                        }
                    }
                }
            }
    
}

    System.out.println(count);
    
    }
    
    }
}

/*

3
3
4
5


*/