import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s1=0,s2=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                s1=s1+i;
            }
        }
        for(int i=1;i<=b/2;i++)
        {
            if(b%i==0)
            {
                s2=s2+i;
            }
        }
        if((a==s2) && (b==s1))
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}