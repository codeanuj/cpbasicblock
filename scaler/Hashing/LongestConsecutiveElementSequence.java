//find longest consecutive element sequence in array



public class LongestConsecutiveElementSequence {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        
        
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0; i<A.length; i++){
            hm.put(A[i],i);
        }
        
        //Intution is find if any element can be start of the sequence //if yes just find till where the sequence ends
        int ans=0;
        for(int i=0; i<A.length; i++){
            if(hm.containsKey(A[i]-1)){
                continue;
            }else{
                int count=0;
                int key=A[i];
                while(hm.containsKey(key)){
                    count++;
                    key++;
                }
                
                ans=Math.max(ans,count);
             }
        }
        
        return ans;
        
        //TC= O(n+n)=O(n)
        //SC=O(n)
        
   
    }
}
