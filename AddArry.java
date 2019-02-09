import java.util.Scanner;
// add all element of array
class AddArry
{
    public static void main(String ... k) {
    int i=0,sum=0;

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
    
    for(i=0;i<num;i++)
    {
        sum=sum+arr[i];
    }
    System.out.println("sum of all element is "+sum);
    }
}