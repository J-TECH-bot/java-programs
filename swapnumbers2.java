import java.util.Scanner;
class swapnumbers2
{
public static void main(String args[])
{
int x,y,swap;
 Scanner S = new Scanner(System.in);  
System.out.println("Enter the two values");
  x= S.nextInt();  
       y= S.nextInt(); 
 
   System.out.println("before swapping numbers: "+x +"  "+ y);  
       
       swap=x;  
       x=y;  
       y=swap;  
       System.out.println("After swapping: "+x +"   " + y);  
         
    }    
}  
