import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>20)
        {
            System.out.print("HOT");
        }
        else
        {
          System.out.print("COLD");   
        }
    }
}