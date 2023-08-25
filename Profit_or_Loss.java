import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(b>a)
        {
            System.out.print("Profit");
        }
        else if(a>b)
        {
          System.out.print("Loss");   
        }
        else
        {
            System.out.print("No profit and No loss");
        }
    }
}