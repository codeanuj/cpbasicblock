public class MinimumAbsoluteDifference {
    public int solve(int[] A) {
        if(A.length==1){
            return 0;
        }
        Arrays.sort(A);
        int min = A[1]-A[0];
        for(int i=1; i<A.length-1; i++){
            int diff = A[i+1]-A[i];
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }
}
