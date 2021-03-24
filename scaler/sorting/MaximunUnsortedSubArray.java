/*Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar such that if we sort(in ascending order) that sub-array, then the whole array should get sorted. If A is already sorted, output -1.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000000



Input Format
First and only argument is an array of non-negative integers of size N.



Output Format
Return an array of length 2 where First element denotes the starting index(0-based) and second element denotes the ending index(0-based) of the sub-array. If the array is already sorted, return an array containing only one element i.e. -1.*/
//There exist a better solution in O(n) time
public class Solution {
    public int[] subUnsort(int[] A) {
        
      int[] B=new int[A.length];
	       for(int i=0; i<A.length;i++) {
	    	   B[i]=A[i];
	       }
	       Arrays.sort(A);
	       int index1=-1;
	       int index2=-1;
	       for(int i =0;i<A.length; i++){
	           if(A[i]!=B[i]){
	               index1=i;
	               break;
	           }
	       }
	       for(int i =A.length-1;i>index1; i--){
	           if(A[i]!=B[i]){
	               index2=i;
	               break;
	           }
	       }
	       
	       if(index1 ==-1){
	           return new int[]{-1};
	       }
	       
	       int[] result = new int[2];
	       result[0]=index1;
	       result[1]=index2;
	       
	       return result;   
    }
}
