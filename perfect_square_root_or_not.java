import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n/2;i++)
        {
            if(i*i==n)
            {
                c++;
                break;
            }
        }
        if(c==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}