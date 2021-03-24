public class MaximumAndMinimumMagic {
    public int[] solve(int[] A) {
        
        //if you see carefully here the minimum we will get we if subtract closer value and maximum we get if we subtract smallest and largest value and so on 
        //to get that lets sort the array
        Arrays.sort(A);
        
        int max=0;
        int min=0;
        
        int left =0;
        int right = A.length-1;
        while(left<right){
            max = (max%1000000007+(A[right]-A[left])%1000000007)%1000000007;
            left++;
            right--;
        }
        
        for(int i=1; i<A.length; i+=2){
            min = (min%1000000007+ (A[i]-A[i-1])%1000000007)%1000000007;
        }
        
        int result[] = new int[2];
        
        result[0]= max;
        result[1] = min;
        
        return result;
    }
}
