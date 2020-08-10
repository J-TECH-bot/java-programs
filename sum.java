import java.util.Scanner;
class  sum
{       public static void main(String args[])
        {       int sum=0;
              int n;
Scanner MyObj=new Scanner(System.in);
System.out.println("Enter the number of array you want");
                n= MyObj.nextInt();
int a[] = new int[n];
System.out.println("Enter the elements");

                for(int i=0;i<n;i++)
{
a[i] = MyObj.nextInt();
       sum=sum+a[i];
 	}
System.out.println("Sum:"+sum);

         }
}
