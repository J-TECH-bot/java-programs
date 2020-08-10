class Numbersbetween1to100
{
public static void main(String ar[])
{	
for(int i=1;i<=100;i++)
{if(i%2==0 && i%3==0 && i%5==0)
break;
System.out.print(i+" ");
}
}
}
