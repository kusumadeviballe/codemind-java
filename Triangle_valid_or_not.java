import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        if(a+b>c&&b+c>a&&a+c>b)
        {
            System.out.print("Valid triangle");
        }
        else{
            System.out.print("Invalid triangle");
        }
    }
}