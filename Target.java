import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>=10&&b>=10&&c>=10&&d>=10)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}