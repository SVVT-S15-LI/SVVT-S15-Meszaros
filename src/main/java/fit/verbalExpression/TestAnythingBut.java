package fit.verbalExpression;

import java.util.regex.Pattern;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestAnythingBut extends ColumnFixture{
	String pValue;
	String match;
	Boolean result;
	
	public String isAnythingBut(){
		String matchStr = null;
		String pValueStr = null;
		if(match!=null){
			matchStr = match;
		}
		if(pValue!=null){
			pValueStr = pValue;
		}
		try{
			 VerbalExpression testRegex = new VerbalExpression.Builder()
             .startOfLine()
             .anythingBut(pValueStr)
             .build();				
			Pattern pt1 = Pattern.compile(testRegex.toString());
			result = pt1.matcher(matchStr).matches();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
}
