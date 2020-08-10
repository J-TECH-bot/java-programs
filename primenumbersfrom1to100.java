class primenumbersfrom1to100
{
public static void main(String args[])
{
int i , j , found=0;
for(i=1;i<=100;i++)
{if(i==1) { continue; }
for(j=2;j<=i/2;j++)
{
found=0;
if(i%j==0)
{
found=1;
break; }
}
if(found==0) { System.out.println(i+" "); }
} 
}
}