//wajp to find the sum of first "n +ve integers "
//do while loop 
//i/p= 5    1+2+3+4+5=15
//i/p= 3   1+2+3=6



import java.io.*;
class P10
{
public static void main(String args[])

{
Console c=System.console();
int num=Integer.parseInt(c.readLine("enter +ve integers "));
if (num>0)
{
int i=1,sum=0;
do 
{
sum+=i;
i+=1;

}

while(i<=num);
System.out.println("sum = " + sum);


}


else 
{
System.out.println("invalid input");
}

}


}