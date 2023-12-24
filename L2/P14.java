//wajp to find a factorial of given integers
//using do while loop  


import java.io.*;

class P13


{
public static void main(String args[])

{
Console c=System.console();
int num = Integer.parseInt(c.readLine("enter +ve integer "));
if(num>=0)
{
int f=1,i=1;

for(int i=1; i<=num; i++);
{
f=f*i;
i=i+1;
}
System.out.println("fact = " + fact);
}
else 
{

System.out.println("invalid num");
}

}
}