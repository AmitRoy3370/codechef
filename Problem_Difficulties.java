
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Problem_Difficulties {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases;
    
    static int a[];
    
    static void solve(){
        
        Set<Integer> set=new HashSet<>();
        
        for(int i: a){
            
            set.add(i);
            
        }
        
       int n=set.size();
        
       //out.println(n/2);
       //out.flush();
       
       int c[]=new int[n];
       
       int index=0;
       
       for(int i: set ){
           
           c[index++]=i;
           
       }
       
           switch (n) {
               case 4:
                   out.println(2);
                   out.flush();
                   break;
               case 3:
                   out.println(2);
                   out.flush();
                   break;
               case 2:
                   //l.sort()
                   
                   int l=0,min=0,max=0,m=0;
                   
                   for(int i: c){
                       
                       min=Math.min(i,min);
                       
                       max=Math.max(i,max);
                       
                   }
                   
                   for(int i: a){
                       
                       if(i==min){
                           
                           l++;
                           
                       }
                       
                       else if(i==max){
                           
                           m++;
                           
                       }
                       
                   }
                   
                   if (l==2 || m==2 ){
                       
                       out.println(2);
                       out.flush();
                   }
                   
                   else{
                       out.println(1);
                       out.flush();
                   }
                   break;
               default:
                   out.println(0);
                   out.flush();
                   break;
           }
    //   out.flush();
       
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=new int[4];
            
            for(int i=0;i<4;i++){
                
                a[i]=in.nextInt();
            
            }
            
            solve();
            
        }
        
    }
 
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

3
1 4 3 2
4 5 5 5
2 2 2 2


*/