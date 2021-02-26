import java.util.Scanner;
public class prime_number_using_member_fuction {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemnent in an array....");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the element one by one");
        for(int i = 0 ; i < n ; i++)
        {
            array[i] = sc.nextInt();
        } 
        for(int i = 0 ; i < n ; i++)
        {
            if(isprime(array[i]))
            {
                System.out.println(array[i]+" is prime number");
            }
            /*
            else
            {
                System.out.println(array[i]+" is not a prime number");
            }
            */
        }
    }
    public static boolean isprime(int n)
    {  
        if (n <= 1)
        {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++)
        {  
            if (n % i == 0)
            {  
                return false;  
            }  
        }  
        return true;  
    }
}
