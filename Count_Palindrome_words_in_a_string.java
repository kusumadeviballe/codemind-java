import java.util.*;
public class PalindromeCount
{
 public static boolean isPalindrome(String word)
 {
 word=word.toLowerCase();
 int left=0;
 int right=word.length()-1;
 while(left<right)
 {
 if(word.charAt(left)!=word.charAt(right))
 return false;
 left++;
 right--;
 }
 return true;
 }
 public static int palindromeCount(String s)
 {
 String[] words=s.split("\s");
 int count=0;
 for(String word:words)
 {
 if(isPalindrome(word))
 count++;
 }
 return count;
 }
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 int palindrome=palindromeCount(s);
 System.out.println(palindrome);
}
}