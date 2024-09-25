package Demooo;

import java.util.Arrays;

public class EqualArray {
	public  int minOps(int arr[] , int size ,int k) {
	//	int max = Arrays.stream(arr).max().getAsInt();
		int max =0;
		for(int i=0 ;i<size;i++) {
			if(max<arr[i])
				max = arr[i];
		}
		int result =0;
		for(int i=0 ;i<size;i++) {
			if((max - arr[i])%k !=0)
				return -1;
			else
			{
				result = result +(max-arr[i])/k;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int [] arr = {21, 33, 9, 45, 15};
		int size = arr.length;
		int k=6;
		
		EqualArray ea = new EqualArray();
		System.out.println(ea.minOps(arr,size,k));

	}

}
