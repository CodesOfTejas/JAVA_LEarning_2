// wajp to read radius and print area and circumference

import java.io.*;


class P6 
{
public static void main(String args[])


{
Console c= System.console();
double radius=Double.parseDouble(c.readLine("enter radius "));
if (radius>0.0)

{
final double PI= 22/7;
double area = PI*radius*radius;
double circum=2*PI*radius;
System.out.println("area=" + area + "circum=" + circum);

}
else
{

System.out.println("invalid radius");
}
}

}