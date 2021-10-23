import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Yet_Another_Flipping_Problem{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
	
	static int testCases;
	
	static long n,k;
	
	static void solve(){
		
	if(k==0){

		out.println("Yes");
		out.flush();
		
		out.println(0);
		out.flush();
		
		return;
    }
    
	if(k%2==0){
        
		out.println("No");
		out.flush();
		
		return;
    }
    
	long size=0;
    
	for(long i=31;i>=0;i--){
       
	   if(((long)Math.pow(2,i)&k)!=0){
            
			size=i+1;
            
			break;
        
		}
    
	}
    
	k=(k+(long)Math.pow(2,size)-1)/2;
    
	out.println("Yes");
	out.flush();
	
	out.println(size);
	out.flush();
	
	long ans=1;
    
	List<Long> list=new ArrayList<>();
	
    for(long i=size-2;i>=0;i--){
        
		if(((long)Math.pow(2,i)&k)!=0){
        
		    list.add(ans);

            //ans+=(1<<i);
        
		     ans+=(long)Math.pow(2,i);
		
		}
        else{
            
			//ans-=(1<<i);
            
			ans-=(long)Math.pow(2,i);
			
			list.add(ans);
        
		}
    
	}
    
	for(long i=size-2;i>=0;i--)
 		
		out.println( list.get((int)i) );
		out.flush();
		
		out.println(ans);
		out.flush();
		
	}
	
	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextLong();
			
			k=in.nextLong();
			
			solve();
			
		}
		
	}
		      static class Node{
    
    long data;
        
    Node next;
 
        public Node(long data) {
        
            this.data = data;
        
            this.next=null;
            
        }
        
    }
    
    static class LinkedList{
        
        Node head=null;
        Node tail=null;
        
        int len;
 
        public LinkedList() {
        
            len=0;
            
        }
       
        void addNode(long data){
            
                   Node newNode = new Node(data);    
              
        if(head == null) {    
          
            head = newNode;    
            tail = newNode;    
        }    
        else {    
           
            tail.next = newNode;    
              
            tail = newNode;    
        }    
            
        len++;
        
        }
        
        void addFront(long data){
            
            len++;
            
            Node node=new Node(data);
            
            if(head==null){
                
                head=node;
                tail=node;
                
            }else{
                
                node.next=head;
                
               // tail=node;
                
                head=node;
                
            }
            
        }
        
        long front(){
            
            return this.head.data;
            
        }
     
        void display() {    
        
        Node current = head;    
            
        if(head == null) {    
              
            return;    
        }    
        
        
        while(current != null) {    
               
            out.print(current.data + " ");    
            out.flush();
            current = current.next;    
        }    
        System.out.println();    
    }    
        
        int size(){
            
            return len;
            
        }
        
    }
	
	static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
	
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
        
        int i=0,j=0,k1=left;
        
        while(i<n1 && j<n2){
            
            if( L[i]<=R[j] ){
                
                a[k1]=L[i];
                
                i++;
                
            }else{
                
                a[k1]=R[j];
                
                j++;
                
            }
            
            k1++;
            
        }
        
        while(i<n1){
            
            a[k1]=L[i];
            
            i++;
            
            k1++;
            
        }
        
        while(j<n2){
            
            a[k1]=R[j];
            
            j++;
            k1++;
            
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
