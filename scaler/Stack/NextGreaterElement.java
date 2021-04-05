//Given an array find the next greater element in array

public class NextGreaterElement {
    public int[] nextGreater(int[] A) {
        
        //we have to find the next greater element 
        // we have choosen stack because you need information about previous element
        Stack<Integer> stack = new Stack();
        int curr_element;
        //run a loop from right to left
        for(int i=A.length-1; i>=0; i--){
            curr_element=A[i];
            //stack is not empty and current element is greater or equal to stack.peek()
            //then pop the stack top and find greater than current element
            while(!stack.isEmpty() && stack.peek()<=curr_element){
                stack.pop();
            }
            //if stack is not empty then put stack.peek() in resultant stack otherwise no element found put -1
            if(!stack.isEmpty()){
            A[i]=stack.peek();
            }else{
                A[i]=-1;
            }
            stack.push(curr_element);
        }
        return A;
    }
}
