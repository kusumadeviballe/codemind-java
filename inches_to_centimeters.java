import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
        int h;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        double b;
        b=h*2.54;
        System.out.printf("%.2f",b);
    }
}