import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.printf("%d",a);
        }
        else{
            System.out.printf("%d",b);
        }
    } 
}