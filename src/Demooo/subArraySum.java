package Demooo;

import java.util.ArrayList;

public class subArraySum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=arr[i];
            if(sum==s){
                list.add(i+1);
                list.add(i+1);
                return list;
            }
            for(int j=i+1;j<n;j++){
                if(sum+arr[j]==s){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
                sum=sum+arr[j];
            }
             //list.add(-1);
             
        }
        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
		int [] arr = {5, 8, 9, 3, 11,7,4};
		int size = arr.length;
		int k=22;
		
		
		System.out.println(subarraySum(arr,size,k));

	}
}