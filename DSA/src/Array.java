import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        int[] arr;
        int start=0;
        int size,pos,val;
        System.out.println("Enter the size of array.");
        Scanner cin = new Scanner(System.in);
        size = cin.nextInt();
        arr=new int[20];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the "+(i+1)+" element: ");
            arr[i] = cin.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

        //delete in at the position you want
        System.out.println("Enter the position you want to delete.");
        pos = cin.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]==pos)
            {
                for(;i<size;i++)
                {
                    arr[i]= arr[i+1];
                }
            }
        }
        size--;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        //Enter the the value at the position you want
        System.out.println("Enter the valu you want.: ");
        val = cin.nextInt();
        System.out.println("Enter the position you want: ");
        pos = cin.nextInt();
        for(int i=0;i<size;i++)
        {
            if(i==pos)
            {
                int temp;
                size++;
                temp=arr[i];
                arr[i]=val;
                int j;
                for(j=++i;j<size;j++)
                {
                    int temp1 = arr[j];
                    arr[j]=temp;
                    temp=temp1;
                }
            }

        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int end=--size;
        //REversing array
        int temp3;
        while(start<end)
        {
            temp3=arr[start];
            arr[start]=arr[end];
            arr[end]=temp3;
            start++;
            end--;
        }
        size++;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

    }
}
