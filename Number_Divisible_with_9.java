import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%9==0)
        {
            System.out.print("True");
        }
        else
        {
          System.out.print("False");   
        }
    }
}