import java.util.Scanner;
class Marks
{
public static void main(String[]args)
{
Scanner S = new Scanner(System.in);
int ar[] = new int[30];
int i,j,count;
System.out.println("Enter the number of students");
int J = S.nextInt();
System.out.println("Enter marks of"+J+" students");
for( i=0;i<J;i++)
{
ar[i]= S.nextInt();
}
System.out.println("\n");
for(j=0;j<100;j++)
{
count = 0;
for(i=0;i<J;i++)
{
if(ar[i]==j)
count++;
}
System.out.println("No of students scored"+j+":"+count);
}
}
}

