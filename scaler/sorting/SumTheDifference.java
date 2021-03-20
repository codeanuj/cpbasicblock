
//Given an integer array A of size N.
//You have to find all possible non-empty subsequence of the array of numbers and then, for each subsequence, find the difference between the largest and smallest
//numbers in that subsequence Then add up all the differences to get the number.





public class SumTheDifference {
    public int solve(int[] A) {
        
        long result=0;
        Arrays.sort(A);
        // An Array can have 2^N-1 subsequences 
        //So if we fixed that our array element is x no of subsequence time maximum and y number of subsequence time is minimum and take difference of both
        int n=A.length;
        long pow[]=new long[n+1];
        pow[0]=1;
        for(int i=1;i<=n;i++)
          pow[i]=(pow[i-1]*2)%1000000007;
        for(int i=0; i<A.length; i++){
            long t=(pow[i]-pow[n-i-1]+1000000007)%1000000007;
            long t2 = (A[i]*t)%1000000007;
            result=(result+t2)%1000000007;
        }
        
        int answer =(int) result%1000000007;
        return answer;
    }
}
