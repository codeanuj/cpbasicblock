//This can be done with stack 
//With brute force time compexity will be n^2



public class NearestSmallerElement {
    public int[] prevSmaller(int[] A) {
        
        int result[]= new int[A.length];
        
        result[0]=-1;
        Stack<Integer> stack=new Stack();
        stack.push(A[0]);
        
        for(int i=1; i<A.length; i++){
         
         if(stack.peek()<A[i]){
             result[i]= stack.peek();
             stack.push(A[i]);
          
         }else{
             while(!stack.isEmpty() && stack.peek()>=A[i]){
                 stack.pop();
                 }
                 
                 if(stack.isEmpty()){
                     result[i]=-1;
                     stack.push(A[i]);
                     continue;
                 }
                 
                 result[i]=stack.peek();
                 stack.push(A[i]);
             }
         }   
        
        
        return result;
    }
}
