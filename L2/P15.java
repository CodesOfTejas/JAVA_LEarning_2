// wajp to find avg marks of "n" students 
import java.io.*;
class P15
{
public static void main(String args[])
{
Console c =System.console();
int n =Integer.parseInt(c.readLine("enter number of students "));
int marks[]=new int[n];


for (i=0;i < n;i++)
marks[i] =Integer.parseInt(c.readLine("enter the marks "));
double sum=0.0,avg=0.0;
for (int i=0;i<n;i++)
sum=sum+marks[i];
avg =sum/n;
System.out.println("avg =" + String.format("%.2f",avg));


}
}