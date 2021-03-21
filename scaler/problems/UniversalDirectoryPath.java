

Given a string A representing an absolute path for a file (Unix-style).

Return the string A after simplifying the absolute path.

Note:

Absolute path always begin with '/' ( root directory ).

Path will not have whitespace characters.


Input Format

The only argument given is string A.
Output Format

Return a string denoting the simplified absolue path for a file (Unix-style).
For Example

Input 1:
    A = "/home/"
Output 1:
    "/home"

Input 2:
    A = "/a/./b/../../c/"
Output 2:
    "/c"


public class UniversalDirectoryPath {
    public String simplifyPath(String A) {
        
        String str[] = A.split("/");
        StringBuilder sb= new StringBuilder();
      
      for(int i=0; i<str.length; i++){
          if(str[i].equals("..") ){
        	  if(sb.length()>=2) {
        	    while(!(sb.charAt(sb.length()-1)=='/')) {
              sb.delete(sb.length()-1,sb.length());
              }
        	  if((sb.charAt(sb.length()-1)=='/')) {
        		  sb.delete(sb.length()-1, sb.length());
        	  }
        	  }
          } else if(str[i].equals(".")) {
        	continue;  
          }else if(str[i].equals("")) {
        	continue;  
          }
          else{
              sb.append("/");
              sb.append(str[i]);
          }
      }
      if(sb.length()==0) {
    	  sb.append("/");
      }
      return sb.toString();
    }
}
