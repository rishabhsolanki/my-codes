package arrays;



import java.io.*;
import java.util.*;
class gfg {
 public static void main(String[] args) {

     // Taking input using class Scanner
     Scanner sc = new Scanner(System.in);

     // Taking total count of testcases
     int t = sc.nextInt();

     while (t-- > 0) {
         // taking total count of elements
         int n = sc.nextInt();

         // creating a new array of size n
         int arr[] = new int[n];

         // inserting elements to the array
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         SolutionClass ob = new SolutionClass();
         // calling firstRepeated method
         // and printing the result
         System.out.println(ob.firstRepeated(arr, n));
     }
 }
}
//} Driver Code Ends


//User function Template for Java

class SolutionClass 
{
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n)
    {
        // Your code here
         LinkedHashMap<Integer,Integer> lh=new LinkedHashMap<>();
         for(int x :arr) {
        	 lh.put(x,lh.getOrDefault(x, 0)+1);
         }
         int index =1;
         for(Map.Entry<Integer, Integer> entry :lh.entrySet()) {
        	 if(entry.getValue()>1) {
        		 return index;
        	 }
        	 index++;
         }
         return -1;     
    }
}
     /*   for(int x:arr)
        {
            lh.put(x,lh.getOrDefault(x,0)+1);
        }
        int indx=1;
        for(Map.Entry<Integer,Integer> c:lh.entrySet())
        {
            if(c.getValue()>1)
            {
                return indx;
            }
            indx++;
        }
        return -1;
    }
}*/