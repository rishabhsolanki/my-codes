package Demooo;

class findTriplet {
	boolean triplet(int arr[] , int n ,int sum) {
		for(int i=0 ;i<n-2;i++) {
			for(int j=i+1 ;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println("triplet is at indices" +arr[i] +","+arr[j]+","+arr[k]);
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main (String []args) {
		System.out.println("Working");
		findTriplet ft = new findTriplet();
		
		int arr[] = {1, 6, 45, 4, 10, 8 };
		int sum = 22;
		int arr_size  = arr.length;
		System.out.println(arr_size);
		ft.triplet(arr, arr_size, sum);
	}

}
