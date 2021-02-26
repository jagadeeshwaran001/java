import java.util.Scanner;
class rotate_clockwise
{
public static int rotate(int[] arr,int n)
{
    n = n-1;
    int a = arr[n];
    for(int i = n-1 ; i <=0 ; i--)
    {
        arr[i+1] = arr[i];
    }
    arr[0] = a;
    return(arr);
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    while(t < 0 )
    {
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for(i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        a = rotate(a,n);
        for(i = 0 ; i < n ;i++)
        {
            System.out.println(a[i]);
        }
        t = t-1;
    }
}
};