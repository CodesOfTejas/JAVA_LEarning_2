import java.io.*;
class P13
{
public static void main(String args[])

{
Console c= System.console();
int num =Intparse.int(c.readLine("enter +ve number "));
if (num>=0)
{
int f=1,i=1;
do 
{
f=f*i
i=i+1;
}
while (i <=num);
System.out.println("fact="+f);
}
else {
System.out.println("invalid input");
}
}
}