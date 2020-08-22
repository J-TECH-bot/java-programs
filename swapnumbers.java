import java.util.Scanner;
class swapnumbers
{
public static void main(String args[])
{
int a , b,c,swap;
 Scanner S = new Scanner(System.in);  
System.out.println("Enter the three values");
  a= S.nextInt();  
       b= S.nextInt(); 
 c= S.nextInt(); 
   System.out.println("before swapping numbers: "+a +"  "+ b+" "+c);  
       
       swap=a;  
       a=c;  
       c=b;
 b=swap;  
       System.out.println("After swapping: "+a +"   " + b+" "+c);  
         
       
}  
}