class ReverseArray
{  public static void main(String args[])
  {  int i,j,temp;
     int A[]={1,2,3,4,5,6,7,8,9,10}; 
     System.out.println("\nOriginal Array : ");
     for(i=0;i<10;i++)    
{  System.out.print(A[i]+" ");  }
     for(i=0,j=9;i<10 && j>=0;i++,j--)
     {	if(i>j)	
break;
    
 temp=A[i];
A[i]=A[j];	 
A[j]=temp;
     }
      System.out.println("\nReversed array : ");
      for(i=0;i<10;i++)	  {  System.out.print(A[i]+" ");  }
  }    }
