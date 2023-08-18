import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       int n,r,q,s=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       q=n;
       while(n!=0)
       {
           r=n%10;
           s=(s*10)+r;
           n=n/10;
       }
       if(s==q)
       {
           System.out.print("Palindrome");
       }
       else
       {
           System.out.print("Not Palindrome");
       }
    }
}
