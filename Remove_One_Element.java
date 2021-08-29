
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Remove_One_Element {

     static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
    
  static long a[];
  
  static long b[];
    
  static void merge(long a[],int left,int right,int mid){
      
      int n1=mid-left+1,n2=right-mid;
      
      long L[]=new long[n1];
      long R[]=new long[n2];
      
      for(int i=0;i<n1;i++){
          
          L[i]=a[left+i];
          
      }
      
      for(int i=0;i<n2;i++){
          
          R[i]=a[mid+1+i];
          
      }
      
      int i=0,j=0,k=left;
      
      while(i<n1 && j<n2){
          
          if(L[i]<=R[j]){
              
              a[k]=L[i];
              
              i++;
              
          }else{
              
              a[k]=R[j];
              
              j++;
              
          }
          
          k++;
          
      }
      
      while(i<n1){
          
          a[k]=L[i];
          
          i++;
          k++;
          
      }
      
      while(j<n2){
          
          a[k]=R[j];
          
          j++;
          k++;
          
      }
      
  }
  
  static void sort(long a[],int left,int right){
      
      if(left>=right){
          
          return;
          
      }
      
      int mid=(left+right)/2;
      
      sort(a,left,mid);
      sort(a,mid+1,right);
      
      merge(a,left,right,mid);
      
  }
  
  static void solve(){
      
      sort(a,0,n-1);
      
      sort(b,0,n-2);
      
      Map<Long,Long> map=new HashMap<>();
      
      for(int i = 0; i < n-1; i++) {
            long m1 = b[i] - a[i];
            long m2 = b[i] - a[i+1];
            if(m1 != m2) {
                if(m2 > 0) {
                    map.put(m2, map.getOrDefault(m2, (long)0) + 1);
                }
            }
            if(m1 > 0) {
                map.put(m1, map.getOrDefault(m1,(long) 0) + 1);
            }
        }
        long ans = (long) Integer.MAX_VALUE;
        for(long k : map.keySet()) {
            if(map.get(k) == n-1) ans = (long) Math.min(ans, k);
        }
        out.println(ans);
        out.flush();
        
  }
  
    public static void main(String[] amit) throws IOException {
        
      testCases=in.nextInt();
        
      for(int t=0;t<testCases;t++){
          
          n=in.nextInt();
          
          a=new long[n];
          
          b=new long[n-1];
          
          for(int i=0;i<n;i++){
              
              a[i]=in.nextLong();
              
          }
          
          for(int i=0;i<n-1;i++){
              
              b[i]=in.nextLong();
              
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
4
1 4 3 8
15 8 11
2
4 8
10
2
2 4
3


*/

/*

1
4
1 4 3 8
15 8 11

*/