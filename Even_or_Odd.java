import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.print("Even");
        }
        else
        {
          System.out.print("Odd");   
        }
    }
}