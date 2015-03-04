package verbalExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Test {
	String add = "";
	String match = "yes";

	public String isMaybe(){
		Boolean result;
		String str = "";
		String matchStr = "yes";
//		if(!add.equals("null")){
//			str = add;
//		}
//		if(!match.equals("null")){
//			matchStr = add;
//		}
//		if(!match.equals("empty")){
//			matchStr = "";
//		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().add(matchStr.substring(0, matchStr.length()-str.length())).maybe(str).build();						
			Pattern pt1 = Pattern.compile(testRegex.toString());
			result = pt1.matcher(matchStr).matches();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		
		
	}

}
