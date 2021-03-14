public class Solution {
    public int solve(int[] A) {
        
        
        int gcd = A[0];
        //intutuion is if you find the whole array gcd and if it is 1 then return 1 because if gcd is greater than one that means this gcd present in every element factors and it will make length 
        //equal to subsequence length and return will be 0 // if gcd 1 then it return 1 and anything || with 1 return 1;
        
        for(int i=1; i<A.length; i++){
            if(A[i]>gcd){
                int temp = gcd;
                gcd = A[i];
                A[i]=temp;
            }
            
            while(A[i]>0){
                gcd =gcd%A[i];
                int temp = gcd;
                gcd = A[i];
                A[i]=temp;
                
            }
        }
        
        if(gcd>1){
            return 0; 
        }
        return 1;
    }
   
  //this method was given
  subsequnce (int subsequence[]) {
    int count[];    //array initialised to 0.
    for(int i = 0; i &amp;lt; subsequence.length; i++) {
        number = subsequence[i];
        for(int j = 2; j &amp;lt;= number; j++) {
            if(number % j == 0) {
                count[j]++;
                if(count[j] == subsequence.length)  return 0;
            }
        }
    }
    return 1;
}

    
}
