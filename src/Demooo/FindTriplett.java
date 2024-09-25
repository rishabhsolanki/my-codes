package Demooo;

class FindTriplett {
    boolean find3Numbers(int A[], int arr_size, int sum)
    {
        for(int i=0;i<arr_size-2;i++) {
        	if(A[i]+A[i+1]+A[i+2]==sum) {
        		System.out.println(A[i]+" "+A[i+1]+" "+A[i+2]);
        		return true;
        	}
        		
        }
        return false;
    }
    public static void main(String[] args)
    {
        FindTriplett triplet = new FindTriplett();
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 55;
        int arr_size = A.length;
  
        triplet.find3Numbers(A, arr_size, sum);
    }
}