
//find max mod of array A i.e A[i]%A[j] should be max


//intution is find the max and secondMax this will give us the answer
public class MaximumModOfArray {
    public int solve(int[] A) {
        
        int B=0;
        int length=A.length;
        
        int max=-1;
        int secondMax=-2;
        
        
        for(int i=0; i<A.length; i++){
            if(max<A[i]){
                int temp = max;
                max=A[i];
                secondMax =temp;
            }
            
            if(A[i]>secondMax && A[i]!=max){
                secondMax =A[i];
            }
        }
        
        if(secondMax<0){
            return 0;
        }
        int result = secondMax%max;
        return result;
        
    }
}
