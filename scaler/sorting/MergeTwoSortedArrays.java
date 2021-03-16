public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {
        
        int length = A.length+B.length;
        int[] result = new int[length];
        
        int i=0;
        int j=0;
        int k=0;
        while(i<A.length && j<B.length){
            if(A[i]>B[j]){
                result[k]=B[j];
                j++;
            }else{
                result[k]=A[i];
                i++;
            }
            k++;
        }
        
        while(i<A.length){
            result[k] = A[i];
            i++;
            k++;
        }
        while(j<B.length){
            result[k] = B[j];
            j++;
            k++;
        }
        
        return result;
    }
}
