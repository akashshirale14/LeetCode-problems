
import java.util.List;
import java.util.ArrayList;


public class ValidParenthesis{


	public static void main(String[] args){
		
		boolean ans=isValid("{}[]");
		System.out.println(ans);
	}

	 public static boolean isValid(String s){
	 	int counter=-1;
	 	boolean flag=false;
	 	List<String>sym=new ArrayList();
	 	sym.add("[]");
	 	sym.add("{}");
	 	sym.add("()");
	 	List<Character> stack=new ArrayList();

	 for(int i=0;i<s.length();i++){
	 	char present=s.charAt(i);
	 	if(present=='{'||present=='['||present=='('){
	 		stack.add(present);
	 		counter++;
	 	}
	 	else{
	 	     String closing=String.valueOf(present);   	
	 	     String opening=String.valueOf(stack.get(counter));
	 	     counter--;
	 	     String result=opening+closing;
	 	     for(int j=0;j<sym.size();j++){
	 	     	  String z=sym.get(j);
	 	     	if(z==result){
	 	     		flag=true;
	 	     		break;
	 	     	}
	 	     	
	 	     }
	 	     if(flag!=true){
	 	     	return flag;
	 	    }
	 	}
	 }

	 return flag;

	 }
}