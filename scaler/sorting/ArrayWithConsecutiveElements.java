public class ArrayWithConsecutiveElements {
    public int solve(int[] A) {
        Arrays.sort(A);
        
        int diff=0;
        for(int i=1; i<A.length; i++){
            diff = Math.abs(A[i]-A[i-1]);
            if(diff != 1){
                return 0;
            }
            
        }
        
        return 1;
    }
}
