//wajp to find the sum of first "n +" positive integers 
//i/p : 5  1+2+3+4+5=15
//i/p : 3  1+2+3=6

import java.io.*;


class P9
{
public static void main(String args[])


{

Console c=System.console();
int num=Integer.parseInt(c.readLine("pls enter the +ve number "));
if (num>0)
{
int i=1, sum=0;
while(i<=num)
{
sum+=i;
i+=1;
}
System.out.println("sum = " + sum);

}
else {
System.out.println("invalid input be focus !!");
}
}

}
