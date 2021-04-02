public class AbsoluteBruteForce { 
    public int largestRectangleArea(int[] A) {
        
        int max_area=0;
        
        for(int i=0; i<A.length; i++){
            int countleft=0;
            int countright=0;
            
            for(int j=i-1; j>=0; j--){
                if(A[j]>A[i]){
                    countleft++;
                }else{
                    break;
                }
            }
            
            for(int k=i+1; k<A.length; k++){
                if(A[k]>A[i]){
                    countright++;
                }else{
                    break;
                }
            }
            
            int width=countleft+countright+1;
            
            int area = A[i]*width;
            
            max_area= Math.max(area, max_area);
        }
        
        return max_area;
    }
}
