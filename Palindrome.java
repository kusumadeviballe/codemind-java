import java.util.*;
public class palindrome{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,temp=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
}