import java.util.*;
class Palindromeornot;
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,rev=0,rem;
    System.out.println("Enter the value of n");
    rem=n%10
    rev=rev*10+rem
    n=n/10
    if(rev==n)
         System.out.println("is palindrome");
    else
        System.out.println("not a palindrome");
    }
}

