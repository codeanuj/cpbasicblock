
//find subsequences of length B in array A whose sum is <=1000

public class Solution {
    int ans;
    
    void subSequence(int i, int []A, int B, int size, int sum){
        
        if(i == A.length){
            if(size == B && sum<=1000){
                ans++;
            }
            return;
        }
        
        subSequence(i+1, A, B, size, sum);
        subSequence(i+1, A, B, size+1, sum+A[i]);
    }
    
    public int solve(int[] A, int B) {
        ans=0;
        subSequence(0,A,B,0,0);
        return ans;
    }
}
