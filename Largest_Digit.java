import java.util.Scanner;
public class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,r;
        while(n!=0)
        {
            r=n%10;
            if(s<=r)
            {
                s=r;
            }
            n=n/10;
        }
        System.out.print(s);
    }
}