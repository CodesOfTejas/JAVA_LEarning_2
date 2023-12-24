//wajp to find the sum of first "+ve "integers 
//i/p= 5 1+2+3+4+5=15
//i/p= 3 1+2+3=6

// for loop 



import java.io.*;


class P11

    {
      public static void main (String args [])

     { 

       Console c= System.console();

   int num=Integer.parseInt(c.readLine("enter the +ve number pls "));
          

           if (num>=0)
          
           {
          
          int sum=0;
           for(int i=1; i<=num; i++)
           {
            sum+=i;
             }
System.out.println("sum= " + sum);

       }
else
{
System.out.println("invalid input" ); 
}
    }


  }