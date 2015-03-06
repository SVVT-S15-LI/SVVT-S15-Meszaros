package fit.verbalExpression;

import java.util.regex.Pattern;

import fit.ColumnFixture;
import verbalExpression.VerbalExpression;


public class TestAnything extends ColumnFixture{
	String match;
	Boolean result;
	
	public String isAnything(){
		String matchStr = null;
		if(match!=null){
			matchStr = match;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder()
			.startOfLine()
		    .anything()
		    .build();					
			Pattern pt1 = Pattern.compile(testRegex.toString());
			result = pt1.matcher(matchStr).find();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
	
}
