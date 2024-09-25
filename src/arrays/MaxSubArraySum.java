package arrays;
public class MaxSubArraySum {
	
    static int maxSubarraySum(int arr[], int n){
        int mSum = arr[0];
        int sum = arr[0];
        for(int i=1 ;i<n;i++){
             if(arr[i]>sum+arr[i])
                sum=arr[i];
             else
                sum=sum+arr[i];
              //  sum=(arr[i]>sum+arr[i])?arr[i]:sum+arr[i];
             if(mSum<sum)
                mSum=sum;              
        }
        return mSum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,-2,5};
		int n = arr.length;
		System.out.println(maxSubarraySum(arr,n));
		

	}

}
