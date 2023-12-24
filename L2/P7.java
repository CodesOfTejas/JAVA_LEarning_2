//wajp to read amt in doller and concvert into ruppees

import java.io.*;

class P7
{
public static void main(String args[])

{
Console c=System.console();
double dollars = Double.parseDouble(c.readLine("enter amt in dollars "));
if (dollars>0.0)
{
double rupees=dollars*82;
System.out.println("rupees="+rupees);
}
else 
{
System.out.println("invalid amt");

}
}



}