package exam;
import java.util.*;
import java.lang.String;
import java.lang.System;
public class ShiftElementsInArray {

  public  void shift(int[] arr) {
    int n=arr.length;
    int temp=arr[n-1];
    for(int i=n-1;i>0;i--)
    {
      arr[i]=arr[i-1];
    }
    arr[0]=temp;
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.

  for(int i=0;i<n;i++)
  {
    System.out.println(arr[i]);
  }
  }

      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
              arr[i]=sc.nextInt();
        }
        ShiftElementsInArray obj=new ShiftElementsInArray();
        obj.shift(arr);
      }
}
