//An arithmetic expression is given by a charater array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//Valid operators are +, -, *, /. Each character may be an integer or an operator.

// A =   ["2", "1", "+", "3", "*"]
// A =  ["-800", "-2", "+", "7", "*"]



public class EvaluatePostfixExpression {
    public int evalRPN(String[] A) {
        
        
        Stack<Integer> stack = new Stack();
        
        for(int i=0; i<A.length; i++){
           
           String s = A[i];
           //This part is just to cover edge cases
           //suppose if "-500" is there so check if it contains - and it's not operator it comes with number i.e. "-500"
           if(s.charAt(0) == '-' && s.length()!=1){
               int p=Integer.parseInt(String.valueOf(s.substring(1, s.length())));
               p=p*(-1);
               stack.push(p);
               continue;
           }
           //if digit then simply push
            char ch = s.charAt(0);
            if(Character.isDigit(ch)){
                stack.push(Integer.parseInt(s));
            }else{
                //this is if getting an operator so pop to operand and find the value
                if(!stack.isEmpty()){
                    int op1 = stack.pop();
                    int op2 = stack.pop();
                    int value = getResult(op1, op2, ch);
                    stack.push(value);
                    
                }
            }
        }
        
        int ans=stack.peek();
        return ans;
        
        
    }
    
    int getResult(int op1, int op2, char ch){
        int result=0;
        switch(ch){
            case '+': result= op1+op2; break;
            case '-': result= op2-op1; break;
            case '*': result= op1*op2; break;
            case '/': result= op2/op1; break;
        }
        return result;
    }
}
