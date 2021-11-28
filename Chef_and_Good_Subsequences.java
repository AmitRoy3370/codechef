
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Chef_and_Good_Subsequences {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,k;
    
    static int a[],count[],b[];
    
    static long dp[][];
    
    static long moduelo=1_000_000_007;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        k=in.nextInt();
        
        a=new int[n];
        
        Set<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
            set.add(a[i]);
            
        }
        
        in.close();
        
       // sort(a,0,n-1);
        
       Map<Integer,Integer> map=new HashMap<>();
        
        /*for(long i: a){
            
            if(map.containsKey(i) ){
                
                map.put(i,map.get(i)+1);
                
            }else{
                
                map.put(i,1);
                
            }
            
           // map.put(i,map.getOrDefault(i, 0)+1 );
            
        }*/
        
      //  out.println(index);
        //out.flush();
        
        int index=set.size();
        
        dp=new long[k+1][index+1];
        
        for(int i=0;i<dp[0].length;i++){
            
            dp[0][i]=1;
            
        }
        
        for(int i: a){
            
            map.put(i,map.getOrDefault(i, 0)+1);
            
        }
        
        int have=1;
        
        b=new int[n+1];
        
        for(int i: set ){
            
            b[have++]=i;
            
        }
        
        /*for(long i: b){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        /*for(long i:map.keySet()){
            
            out.println(i+" "+map.get(i));
            out.flush();
            
        }*/
        
        for(int i=1;i<dp.length;i++){
            
            for(int j=i;j<dp[0].length;j++){
                
                dp[i][j]=(dp[i][j-1]+(dp[i-1][j-1]*map.get(b[j]))%moduelo)%moduelo;
               // dp[i][j]%=moduelo;
                
            }
            
        }
        
        long ans=0;
        
        /*out.println("matrix: ");
        out.flush();
        
        for(long i[]: dp){
            
            for(long j: i){
                
                out.print(j+" ");
                out.flush();
                
            }
            
            out.println();
            out.flush();
            
        }*/
        
        for(int i=0;i<dp.length;i++){
            
            ans+=(dp[i][dp[0].length-1])%moduelo;
            
            ans%=moduelo;
            
        }
        
        out.print(ans);
        out.flush();
        
    }
                 
   static class Node<T>{
    
    T data;
    
    Node<T> next;

    public Node() {
    
        this.next=null;
    
    }

    public Node(T data) {
        
        this.data = data;
    
        this.next=null;
        
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    @Override
    public String toString(){
        
        return this.getData().toString()+"  ";
        
    }
    
}

   static class ArrayList<T>{
           
    Node<T> head,tail;
    
    int len;

    public ArrayList() {
    
    this.head=null;    
        
    this.tail=null;
    
    this.len=0;
    
    }
    
    int size(){
        
        return len;
        
    }
    
    boolean isEmpty(){
        
        return len==0;
        
    }
    
    int indexOf(T data){
        
        if( isEmpty() ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        Node<T> temp=head;
        
        int index=0,i=0;
        
        while(temp!=null){
            
            if( temp.getData()==data ){
                
                index=i;
                
            }
            
            i++;
            
            temp=temp.getNext();
            
        }
        
        return index;
        
    }
    
    void add(T data){
        
        Node<T> newNode=new Node<>(data);
        
        if( isEmpty() ){
            
            head=newNode;
            
            tail=newNode;
            
            len++;
            
        }else{
        
        tail.setNext(newNode);
            
        tail=newNode;
        
        len++;
        
        }
        
    }
    
    void see(){
        
        if( isEmpty() ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        Node<T> temp=head;
        
        while( temp!=null ){
            
            out.print(temp.getData().toString()+" ");
            out.flush();
            
            temp=temp.getNext();
            
        }
        
        out.println();
        out.flush();
        
    }
            
    void inserFirst(T data){
        
        Node<T> newNode=new Node<>(data);
        
        Node<T> temp=head;
        
        if( isEmpty() ){
            
            head=newNode;
            tail=newNode;
            
            len++;
            
        }else{
            
            newNode.setNext(temp);
            
            head=newNode;
            
            len++;
            
        }
        
    }
    
    T get(int index){
        
        if( isEmpty() || index>=len ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        Node<T> temp=head;
        
        if(index==0){
            
            return temp.getData();
            
        }
        
        int i=0;
        
        T data=null;
        
        while(temp!=null){
            
            if( i==index ){
                
                data=temp.getData();
                
            }
            
            i++;
            
            temp=temp.getNext();
            
        }
        
        return data;
        
    }
    
    void addAt(T data,int index){
        
        if( index>=len ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        Node<T> newNode=new Node<>(data);
        
        int i=0;
        
        Node<T> temp=head;
        
        while( temp.next!=null ){
            
            if(i==index){
                
                newNode.setNext(temp.next);
                
                temp.next=newNode;
                
            }
            
            i++;
            
            temp=temp.getNext();
            
        }
        
    //    temp.setNext(temp);
        
        len++;
        
    }
    
    void popFront(){
        
        if( isEmpty() ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        if( head==tail ){
            
            head=null;
            tail=null;
            
        }else{
            
            head=head.getNext();
            
        }
        
        len--;
        
    }
    
    void removeAt(int index){
        
        if( index>=len ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        if(index==0){
            
            this.popFront();
            
            return;
            
        }
        
        Node<T> temp=head;
        
        int i=0;
        
        Node<T> n=new Node<>();
        
        while(temp!=null){
            
            if(i==index){
                
                n.next=temp.next;
                
                temp.next=n;
                
                break;
                
            }
            
            i++;
            
            n=temp;
            
            temp=temp.getNext();
            
        }
        
        tail=n;
        
        --len;
        
    }
    
    void clearAll(){
        
        this.head=null;
        this.tail=null;
        
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
	
    static class Node1<T>{
        
        T data;
        
        Node1 next;

        public Node1(T data) {
            this.data = data;
        
            this.next=null;
            
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node1 getNext() {
            return next;
        }

        public void setNext(Node1 next) {
            this.next = next;
        }
        
    }
    
    static class Stack<T>{
        
        int len;
        
        Node1<T> node;

        public Stack() {
        
            len=0;
            
            node=null;
            
        }
        
        boolean isEmpty(){
            
            return len==0;
            
        }
        
        int size(){
            
            return len;
            
        }
        
        void push(T data){
            
            Node1<T> temp=new Node1<>(data);
            
            temp.setNext(this.node);
            
            node=temp;
            
            len++;
            
        }
        
        T top(){
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            return this.node.getData();
            
        }
        
        T pop(){
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            T data=this.node.getData();
            
            this.node=this.node.getNext();
            
            len--;
            
            return data;
            
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

5 3
2 2 3 3 5


*/