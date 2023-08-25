import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((b+(2*c))>=a)
        {
            System.out.print("Qualify");
        }
        else{
            System.out.print("Not Qualify");
        }
    }
}