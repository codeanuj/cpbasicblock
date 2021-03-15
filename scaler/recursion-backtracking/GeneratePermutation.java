public class GeneratePermutation {
    
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    
    
  public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        
        int[] box = new int[A.size()];
        generatePermutation(A,box,0);
        return result;
    }
    
     void generatePermutation(ArrayList<Integer> A, int[] box, int index ){
       
         if(index == box.length){
           ArrayList<Integer> list = new ArrayList<>();
           for(int k=0;k<index; k++){
            
               list.add(box[k]);
           }
           result.add(list);
           return;
       }
       
       for(int i=0; i<A.size(); i++){
           
           //validate if the current element from array already in box // if yes ignore it otherwise call permutation
        boolean valid=true;
        int q=A.get(i);
          for(int j=0; j<index;j++){
           
              
             if(box[j] == q){
              valid=false;
              break;
            }
          }
        if(valid){
            box[index]=q;
            generatePermutation(A, box, index+1);
        }
      }  
   }
}
