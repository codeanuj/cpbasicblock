public class Solution { 
   
    public int largestRectangleArea(int[] A) {
        
        int max_area=0;
        int curr_element;
        int width;
        int area;
        
      //create a stack
        Stack<Integer> stack = new Stack();
        
      //two array for left boundry and right boundry
        int l[]=new int[A.length];
        int r[]=new int[A.length];
        
      //for left boundry
        for(int i=0; i<A.length; i++){
            curr_element= A[i];
          //if stack is not empty and current_element is less than or equal to peek of stack means it can expand on left side
          //in stack we are storing index that's why A[peek]
            while(!stack.isEmpty() && A[stack.peek()]>=curr_element){
                stack.pop();
            }
          //if stack is not empty then simply put peek+1 index in array as boundry
          //else case not written as array initialize with 0
            if(!stack.isEmpty()){
                l[i]= stack.peek()+1;
            }
               
         // always push the current index
            stack.push(i);
        }
        
      // empty the array before calculating right boundry
        while(!stack.isEmpty()){
              stack.pop();
        }
        
      //for right boundry
        for(int i=A.length-1; i>=0; i--){
            curr_element= A[i];
            while(!stack.isEmpty() && A[stack.peek()]>=curr_element){
                stack.pop();
            }
          //here if stack is empty means all the elements are popped and till now no element is less than current then lift boundry simply the arr.length-1
          //else peek-1
            if(stack.isEmpty()){
                r[i]=A.length-1;
            }else{
               r[i]= stack.peek()-1;
            }
            stack.push(i);
        }
        
        for(int i=0;i<A.length;i++){
            width =r[i]-l[i]+1;
            area = width*A[i];
            max_area = Math.max(area, max_area);
            
        }
        return max_area;
    }
}
