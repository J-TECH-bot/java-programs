import java.util.Scanner;
class evenoddnumber
{
public static void main(String args[])
{
int x ;
 Scanner S = new Scanner(System.in);  
System.out.println("Enter the value");
  x = S.nextInt();  
       if(x%2==0)
{
       System.out.println("its an even number: "+x );  
  }
  else if(x==0)
{
      System.out.println("its an zero: "+x );  
 }
else 
      System.out.println("its an odd  number: "+x ); 
    }    
}  
