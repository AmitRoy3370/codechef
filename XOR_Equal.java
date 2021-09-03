import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class XOR_Equal {

      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
  
  static long  a[];
  
  static long x;
  
  static void solve(){
      
      Map<Long,Integer> count=new HashMap<>();
      
      Map<Long,Boolean> present=new HashMap<>();
      
   for(long i: a){
       
       if( !count.containsKey(i) ){
           
           count.put(i,1);
           
       }else{
           
           count.put( i,count.get(i)+1 );
           
       }
       
       present.put( i,true );
       
   }   
      
   if(n==1){
       
       out.println(1+" "+0);
       out.flush();
   
       return;
       
   }
   
   long ans=0,changes=0;
   
   for(long i: count.keySet()){
       
       if( count.get(i)==n ){
           
           ans=n;
         
           break;
       }
   
       if( count.get(i)>=ans ){
           
           ans=count.get(i);
           
       }
       
   }
   
   if(x==0){
       
       out.println(ans+" "+changes);
       out.flush();
   
       return;
       
   }
   
   for(long i: count.keySet()){
       
       if( present.containsKey( i^x  ) ){
           
           if( ( count.get(i)+count.get(i^x))>ans ){
               
               ans=count.get(i)+count.get(i^x);
               
               changes=Math.min(count.get(i),count.get(i^x)  );
               
           }else if( ( count.get(i)+count.get(i^x))==ans ){
               
               if(Math.min(count.get(i),count.get(i^x)  )<changes){
                   
                   changes=Math.min(count.get(i),count.get(i^x)  );
                   
               }
               
           }
           
       }
       
   }
   
   out.println(ans+" "+changes);
   out.flush();
   
  }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            x=in.nextLong();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
            }
            
            solve();
            
        }
        
        in.close();
        
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
3 2
1 2 3
5 100
1 2 3 4 5
4 1
2 2 6 6


*/