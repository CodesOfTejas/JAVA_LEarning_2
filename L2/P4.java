//wajp to read two int 
//and print their addition 


import java.io.*;
class P4
{
public static void main (String args[])

{
Console c = System.console();
int n1=Integer.parseInt(c.readLine("enter first integer "));
int n2=Integer.parseInt(c.readLine("enter second integer "));
int result=n1 + n2;
System.out.println("result=" + result);

}


}