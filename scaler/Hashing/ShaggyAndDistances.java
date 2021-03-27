
//Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array as a special pair if elements at that index in the array are equal.

//Shaggy wants you to find a special pair such that distance between that pair is minimum. Distance between two indices is defined as |i-j|.
//If there is no special pair in the array then return -1.


public class ShaggyAndDistances {
    public int shaggyAndDistances(int[] A) {
        
        int min=Integer.MAX_VALUE;
        HashMap<Integer, Integer> hm = new HashMap();
        //Intution is if you find element which is already n hashmap just calculate the distance by doing current_index- stored_index, update hash value every time by latest index
        for(int i=0; i<A.length; i++){
            
            if(hm.containsKey(A[i])){
                int value = hm.get(A[i]);
                int distance =i-value;
                min = Math.min(min, distance);
            }
               hm.put(A[i],i);
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
