// wajp for factorial
import java.io.*;
class P12
{
public static void main(String args[])
{
    Console c= System.console();
    int num= Integer.parseInt(c.readLine("enter +ve integer" ));
    if (num>=0)
{

    int f=1, i=1;
    while(i<=num);
{
   f=f*i;
   i=i+1;
} 
 System.out.println("fact="+f);
}
else
{
    System.out.println("Invalid");
}
}
}