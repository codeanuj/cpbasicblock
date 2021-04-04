//Largest rectangle in histogram
//This is brute force but with better space complexity

//The intution is to find the left boundry and right boundry of element i.e. till where it can expand


public class LargestRectangleInHistogram { 
    public int largestRectangleArea(int[] A) {
        
        int max_area=0;
        
        int left;
        int right;
        int curr_element;
        int width;
        int area;
        for(int i=0; i<A.length; i++){
            curr_element=A[i];
            left=0;
            right=0;
            
            for(int j=i; j>=0; j--){
                if(curr_element>A[j]){
                    left =j+1;
                    break;
                }
            }
            
            for(int k=i;k<A.length; k++){
                if(curr_element>A[k]){
                    right=k-1;
                    break;
                }
                if(right==0 && k==A.length-1){
                    right=k;
                }
            }
            
            
            area=(right-left+1)*curr_element;
            max_area= Math.max(area,max_area);
        }
        
        return max_area;
    }
}
