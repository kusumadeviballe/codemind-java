import java.util.Scanner;
public class Average{
    public static void main(String[] args){
    int Num1,Num2;
    Scanner sc=new Scanner(System.in);
    Num1=sc.nextInt();
    Num2=sc.nextInt();
    double Average;
    Average=(double)(Num1+Num2)/2;
    System.out.printf("Average of "+Num1+" and "+Num2+" is: "+"%.2f",Average);
    }
}