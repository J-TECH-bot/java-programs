import java.util.Scanner;
class reverses2
{    
    public static void main(String[] args) 
{    
String rev="";
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first name");
String s1 = scan.nextLine();
System.out.println("Enter the last name");
String s2 = scan.nextLine();
int length=s2.length();
for(int i=length-1;i>=0;i--)
  rev=rev+s2.charAt(i);
String c = s1+rev;
System.out.println("full name is"+c);

    }    
}     