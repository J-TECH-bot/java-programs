import java.util.Scanner;
class countstring  
{    
    public static void main(String[] args) 
{    
Scanner scan = new Scanner(System.in);
System.out.print("Enter the string");
String s = scan.nextLine();
char[] ch = s.toCharArray();
int count =0;
for(char i: ch)
{
count++;
}
System.out.print(count);
  
    }    
}     