import java.util.Scanner;
class smallestdivisor
{
public static void main(String args[])
{
int n;
int result;
Scanner S = new Scanner(System.in);
System.out.println("Enter the number");
n= S.nextInt();
{
  if((n % 2) != 0)
{
   int r = (int)Math.sqrt(n);
   int d = 3;
   while((n % d) != 0 && d < r)
{
    d = d + 2;
   }
   if(n%d == 0){
    result = d;
   }
   else{
    result = 1;
   }
  }
  else{
   result = 2;
  }
 }
 
  System.out.println("the smallest divisor of " + n + " is: " + result);
 }
}

