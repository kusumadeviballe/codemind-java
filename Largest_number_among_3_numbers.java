import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b)
        {
          if(a>c)
          {
              System.out.printf("%d",a);
          }
          else
          {
              System.out.printf("%d",c);
          }
        }
        else
        {
           if(b>c)
           {
               System.out.printf("%d",b);
           }
           else
           {
               System.out.printf("%d",c);
           }
        }
    }
}