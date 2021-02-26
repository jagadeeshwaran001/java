import java.util.*;
class input
{
    public static void main(String[] args)
    {
        Scanner inpu = new Scanner(System.in);

        System.out.println("enter the input as integer.....");
        int a = inpu.nextInt();
        inpu.nextLine();
        System.out.println("enter the input as string.....");
        String b = inpu.nextLine();
        System.out.println("The outputs are :");
        System.out.println(a);
        System.out.println(b);
    }
}