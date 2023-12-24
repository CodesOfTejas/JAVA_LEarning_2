//wajp to ask the user name amd then welcome 
//System.console()



import java.io.*;

class P2 
{
public static void main(String args[])

{
Console c=System.console();
String name =c.readLine(" enter your name ");
String msg=" welcome " + name ;
System.out.println(msg);
}
}
