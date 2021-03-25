//You are given 3 sorted arrays A, B and C.

//Find i, j, k such that : max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) is minimized.

//Return the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i]))


public class Array3Pointers {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int minimize(final int[] A, final int[] B, final int[] C) {
        
        int i=0;
        int j=0;
        int k=0;
        //The inutution is find the equation value, now you will increment the value which is min, because we want min and max close to put it closer we can not minimize our max so we will
        //maximize our min
        int result = Integer.MAX_VALUE;
        while(i<A.length && j<B.length && k<C.length){
            int value = Math.max(Math.max(Math.abs(A[i]-B[j]),Math.abs(B[j]-C[k])), Math.abs(C[k]-A[i]));
            if(value<result){
                result=value;
            }
            
            int min= Math.min(Math.min(A[i], B[j]),C[k]);
            
            if(min==A[i]){
                i++;
            }else if(min==B[j]){
                j++;
            }else{
                k++;
            }
        }
        
        return result;
    }
}
