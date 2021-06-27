
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Total_Correct_Submissions {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,n;
    
    static String problem1[],problem2[],problem3[];
    static int score3[],score2[],score1[];
    
    static void solve(){
        
        Map<String,Boolean> map=new HashMap<>();
        
        Map<String,Integer> problemSolver=new HashMap<>();
        
        Set<String> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            
            set.add(problem3[i]);
            set.add(problem2[i]);
            set.add(problem1[i]);
        
            problemSolver.put(problem3[i], 0);
            problemSolver.put(problem2[i], 0);
            problemSolver.put(problem1[i], 0);
            
        }
        
        long correct[]=new long[set.size()];
        
        set.forEach((i) -> {
            problemSolver.put(i, 0);
         });
        
        for(int i=0;i<n;i++){
            
            map.put(problem3[i], true);
            
            problemSolver.put(problem3[i], problemSolver.get(problem3[i])+score3[i]);
            
        }
        
        for(int i=0;i<n;i++){
            
            if( map.containsKey(problem2[i]) ){
                
                map.put(problem2[i], Boolean.TRUE);
                
                problemSolver.put(problem2[i], problemSolver.get(problem2[i])+score2[i]);
                
            }else{
                
                map.put(problem2[i], Boolean.TRUE);
                
                problemSolver.put(problem2[i], score2[i]);
                
            }
            
        }
        
        for(int i=0;i<n;i++){
            
            if( map.containsKey(problem1[i]) ){
                
                map.put(problem1[i], Boolean.TRUE);
                
                problemSolver.put(problem1[i], problemSolver.get(problem1[i])+score1[i]);
                
            }else{
                
                map.put(problem1[i], Boolean.TRUE);
                
                problemSolver.put(problem1[i], score1[i]);
                
            }
            
        }
        
        int index=0;
        
        for(int i: problemSolver.values()){
            
            correct[index++]=i;
            
        }
        
        Arrays.sort(correct);
        
        for(long i: correct){
            
            out.print(i+" ");
            
        }
        
        out.println();
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            problem3=new String[n];
            problem2=new String[n];
            problem1=new String[n];
            
            score3=new int[n];
            score2=new int[n];
            score1=new int[n];
            
            for(int i=0;i<n;i++){
                
                problem3[i]=in.next().trim();
                score3[i]=in.nextInt();
                
            }
            
            for(int i=0;i<n;i++){
                
                problem2[i]=in.next().trim();
                score2[i]=in.nextInt();
                
            }
            
            for(int i=0;i<n;i++){
                
                problem1[i]=in.next().trim();
                score1[i]=in.nextInt();
                
            }
            
            solve();
            
        }
        
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
     }
    
}
/*

3
1
A 1
B 2
C 3
2
AA 1
AB 1
AB 1
AC 1
AC 1
AD 1
1
Z 100
Z 100
Z 100

*/

/*

1
2
AA 1
AB 1
AB 1
AC 1
AC 1
AD 1

*/