import java.util.Scanner;
class countnumbers
{
public static void main(String args[])
{
int count=0;
int number;
Scanner S = new Scanner(System.in);
System.out.print("Enter the number");
number = S.nextInt();
while(number!= 0)
        {
          number /= 10;
            ++count;
        }
System.out.println("the number of integer are: " +count);


}
}