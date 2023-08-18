import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       int n,r,q,s=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       while(n!=0)
       {
           r=n%10;
           n=n/10;
           s=s*10+r;
       }
       System.out.printf("%d",s);
    }
}
