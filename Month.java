import java.util.Scanner;
// by name of month tll the month in number
class Month
{   
    public static void main(String ... k) {
        Scanner sc=new Scanner(System.in);
        int flag=0,i;
        String arr[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        System.out.println("enter name of month in three letters");
        String data = sc.nextLine();
        for(i=0;i<12;i++)
        {
            if( data.equals(arr[i]))
            {
                System.out.println(data +" is month number "+(i+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("enter correct name");
    }
}