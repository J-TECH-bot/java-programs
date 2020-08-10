
class Average
{       public static void main(String args[])
        {       int sum=0;
                float avg;
                int ar[]={1,2,3,4,5,6,7,8,9,10};
                for(int i=0;i<ar.length;i++)
                {    sum=sum+ar[i]; 	}
                avg=sum/10f;
                System.out.println("Average = "+avg);
         }
}

