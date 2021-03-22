public class SubArrayWithGivenSum {
    public int[] solve(int[] A, int B) {
        
        int left =0; int right=0;
        int sum=A[0];
        boolean flag=false;
        
        while(right<A.length && left<=right+1){
            if(sum==B){
                 int[] result = new int[right-left+1];
                 int k=0;
                 for(int i=left; i<=right; i++){
                   result[k]=A[i];
                   k++;
                }
            
              return result;
            }
            if(sum<B){
                right++;
                if(right<A.length)
                  sum+=A[right];
                
            }else{
                sum-=A[left];
                left++;
            }
        }
        
        return new int[]{-1};
    }
}
