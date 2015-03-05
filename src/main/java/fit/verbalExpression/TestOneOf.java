package fit.verbalExpression;

import java.util.regex.Pattern;

import fit.ColumnFixture;
import verbalExpression.VerbalExpression;

public class TestOneOf extends ColumnFixture{
	String input1;
	String input2;
	String match;
	Boolean result;
	
	public String isOneOf(){
		String matchStr = null;
		String input1Str = null;
		String input2Str = null;
		
		if(match!=null){
			matchStr = match;
		}
		if(input1!=null){
			input1Str = match;
		}
		if(input2!=null){
			input2Str = match;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().anything().oneOf(input1Str, input2Str).build();
            Pattern pt1 = Pattern.compile(testRegex.toString());
            result = pt1.matcher(matchStr).find();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
}
