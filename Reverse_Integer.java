import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            int digit =n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.print(rev);
    }
}