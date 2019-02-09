import java.util.Scanner;
import java.util.Arrays;
// find n th largest number in array
class nLarg
{
    public static void main(String ... k) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element");
        int num = sc.nextInt();
        int arr[]=new int[num];
        for(i=0;i<num;i++)
        {
            System.out.println("enter element "+i);
            arr[i] =sc.nextInt();
    
        }
        System.out.println("your element array");
        for(i=0;i<num;i++)
        {
            System.out.println("element "+i+" "+arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Enter N th number ");
        int data=sc.nextInt();
        System.out.println(data+" th lagest element is "+arr[num-data]);
    }
}