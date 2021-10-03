import java.util.Scanner;

public class Digit_Removal {

    static Scanner in=new Scanner(System.in);
    
    static char a[];
    
    static int n,d,testCases;
    
    static void solve(){
        
        char b[]=new char[n];
        
        System.arraycopy(a, 0, b, 0, n);
        
    //    System.out.println("b: "+new String(b)+" a: "+new String(a) );
        
        if( !new String( a ).contains( String.valueOf(d) ) ){
            
            System.out.println( 0 );
            return;
        }
        
        if(n==1){
            
            System.out.println( ( 1) );
            
            return;
            
        }
        
        switch (d) {
            case 0:
                {
                    int i=0;
                    for( i=0;i<n;i++){
                        
                        if( a[i]=='0' ){
                            
                            a[i]='1';
                            
                            break;
                            
                        }
                        
                    }       for(int j=i+1;j<n;j++){
                        
                        a[j]='1';
                        
                    }    break;
                }
            case 9:
                if( a[0]=='9' ){
                    
                    char c[]=new char[n+1];
                    
                    for(int i=1;i<=n;i++){
                        
                        c[i]='0';
                        
                    }
                    
                    c[0]='1';
                    
                    a=c;
                    
                }else{
                    
                    int i=0;
                    
                 for( i=0;i<n;i++){
                     
                     if(a[i]-'0'==d){
                         
                //         System.out.println("here");
                         
                         for(int j=i-1;j>=0;j--){
                             
                     if( (a[j]-'0')<=7 ){
                         
                         a[j]=String.valueOf( (a[j]-'0')+1 ).charAt(0);
                         
                         for(int k=j+1;k<n;k++){
                             
                             a[k]='0';
                             
                         }
                         
                    //    System.out.println("a: "+new String(a)+" b: "+new String(b) );
                         
                         System.out.println( Math.abs( Long.parseLong(new String(a) )-Long.parseLong(new String(b) ) ) );
                         
                         return;
                         
                     }        
                      
                         }
                     
                         char c[]=new char[n+1];
                         
                         for(int j=1;j<=n;j++){
                             
                             c[j]='0';
                             
                         }
                         
                         c[0]='1';
                         
                         a=c;
                         
                         break;
                         
                     }
                     
                 }
                    
                }    break;
            default:
                {
                    int i=0;
                    for( i=0;i<n;i++){
                        
                        if( (a[i]-'0')==d ){
                            
                          //  System.out.println("a[i]: "+(a[i]-'0') );
                            
                         // int y=a[o]
                          
                            a[i]=String.valueOf(( a[i]-'0' )+1).charAt(0);
                            
                        //   a[i]='1';
                           
                            //System.out.println("a[i]: "+(a[i]-'0') );       
                            
                            break;
                            
                        }
                        
                    }
                    
                    for(int j=i+1;j<n;j++){
                        
                        a[j]='0';
                        
        
                    }     break;
                
                }
        
        }
        
   //     System.out.println("b: "+new String(b)+" a: "+new String(a) );
        
        System.out.println( Math.abs(Long.parseLong( new String(b).trim() )-Long.parseLong( new String(a).trim() )) );
        
    }
    
    public static void main(String[] amit) {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
       //     n=in.nextInt();
            
          //  d=in.nextInt();
            
            a=in.next().trim().toCharArray();
            
            d=in.nextInt();
            
            n=a.length;
            
            solve();
            
        }
        
    }
    
}
/*

5
21 5
8 8
100 0
5925 9
434356 3


*/

/*

1
45671239456 9

*/

/*

1
45671239456 7

*/

/*

1
5925 9

*/

/*

1
88894 9

*/