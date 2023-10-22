import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int c=0;
        for(int i=0;i<m/2;i++)
        {
            if(i*(i+1)==m)
            {
                c++;
            }
        }
        if(c>=1)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}