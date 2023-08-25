import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a;
        double b;
        a=sc.nextFloat();
        if(a<=199)
        {
            b=1.20;
        }
        else if(a>=200&&a<=400)
        {
            b=1.50;
        }
        else if(a>=400&&a<=600)
        {
            b=1.80;
        }
        else
        {
            b=2.00;
        }
        double bill=a*b;
        double tb;
        if(bill>400)
        {
            tb=bill+(bill*0.15);
            System.out.printf("%.2f",tb);
        }
        else
        {
            tb=bill+100;
            System.out.printf("%.2f",tb);
        }
    }
}