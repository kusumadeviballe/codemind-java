import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p,c,b,m,com,per;
        p=sc.nextInt();
        c=sc.nextInt();
        b=sc.nextInt();
        m=sc.nextInt();
        com=sc.nextInt();
        per=(p+b+c+m+com)/5;
        if(per>=90)
        {
            System.out.print("Grade A");
        }
        else if(per>=80)
        {
            System.out.print("Grade B");
        }
        else if(per>=70)
        {
            System.out.print("Grade C");
        }
        else if(per>=60)
        {
            System.out.print("Grade D");
        }
        else if(per>=40)
        {
            System.out.print("Grade E");
        }
        else if(per<40)
        {
            System.out.print("Grade F");
        }
        else
        {
            System.out.print("no grade");
        }
    }
}