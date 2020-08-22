import java.util.Scanner;
class concatenation
{    
    public static void main(String[] args) 
{    
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first name");
String s1 = scan.nextLine();
System.out.println("Enter the last name");
String s2 = scan.nextLine();
String c = s1+s2;
System.out.println("full name is"+c);

    }    
}     