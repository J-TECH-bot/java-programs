import java.util.Scanner;
class replacevowels 
{    
    public static void main(String[] args) 
{    
Scanner scan = new Scanner(System.in);
System.out.print("Enter the string");
String s = scan.nextLine();
char ch[] = s. toCharArray();
for(int i=0; i<ch.length; i++)
{
if (ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
{
ch[i]='z';
}
}
for(int i=0; i<ch.length; i++)
{
System.out.print(ch[i]);
  }
    }    
}     