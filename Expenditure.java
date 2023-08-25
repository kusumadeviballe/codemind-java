import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=b*30;
        if(c<=a)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}