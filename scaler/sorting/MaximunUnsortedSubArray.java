/*Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar such that if we sort(in ascending order) that sub-array, then the whole array should get sorted. If A is already sorted, output -1.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000000



Input Format
First and only argument is an array of non-negative integers of size N.



Output Format
Return an array of length 2 where First element denotes the starting index(0-based) and second element denotes the ending index(0-based) of the sub-array. If the array is already sorted, return an array containing only one element i.e. -1.*/

public class Solution {
    public int[] subUnsort(int[] A) {
        
        int i= 0;
        int j=A.length-1;
        //with two pointer find the i and j which are unsorted and return it
       
        boolean flag1 = true;
        boolean flag2 = true;
        while(i<j){
            if(A[i+1]>A[i] && flag1){
                i++;
            }else{
                flag1=false;
            }
            if(A[j]>A[j-1] && flag2){
                j--;
            }else{
                flag2 = false;
            }
            if(!(flag1||flag2)){
                break;
            }
        }
         if(i==j){
            return new int[]{-1};
        }
        
        int[] result = new int[2];
        result[0] = i;
        result[1] = j;
        
        return result;
        
    }
}
