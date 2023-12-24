//wajp to find the sum of firsdt n "+ve " integers 
// i/p:  1+2+3+4+5=15
//i/0p:3 1+2+3+=6

import java.io.*;
class P8

{
public static void main(String args[])


{
Console c=System.console();
int num=Integer.parseInt(c.readLine("enter +ve integer "));
if (num>0)
{
  int i=1,sum=0;
while (i<=num)
{
sum=sum + i;
i = i + 1;
}
System.out.println("sum=" + sum);

}
else 
{
System.out.println("invalid inout");

}
}

}