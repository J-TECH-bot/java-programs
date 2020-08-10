import java.util.Scanner;
class binarytodecimal
{ 
    static int binaryToDecimal(int n) 
    { 
        int number = n; 
        int decimal_value = 0; 
  
        
        int a = 1; 
  
        int temp = number; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            decimal_value+= last_digit * a; 
  
            a= a * 2; 
        } 
  
        return decimal_value; 
    } 
  
    
    public static void main(String[] args) 
    { 
int number;
        System.out.println("Enter the binary code");
Scanner S = new Scanner(System.in);
number = S.nextInt();
        System.out.println(binaryToDecimal(number)); 
    } 
} 
  