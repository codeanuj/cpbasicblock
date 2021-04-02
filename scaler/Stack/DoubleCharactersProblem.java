

public class DoubleCharactersProblem {
    public String solve(String A) {
        
        Stack<Character> stack = new Stack();
        
        for(int i=0; i<A.length(); i++){
            
            if(!stack.isEmpty() && A.charAt(i) == stack.peek()){
                stack.pop();
            }else{
                stack.push(A.charAt(i));
            }
        }
        
        Iterator<Character> itr =stack.iterator();
        StringBuilder sb=new StringBuilder();
        while(itr.hasNext()){
            sb.append(itr.next());
        }
        
        return sb.toString();
    }
}
