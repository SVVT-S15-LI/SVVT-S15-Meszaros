package fit.verbalExpression;

import java.util.regex.Pattern;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestSomethingButNot extends ColumnFixture{
	String pValue;
	String match;
	Boolean result;
	
	public String isAnythingButNot(){
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
            .somethingButNot(pValueStr)
            .build();			
			Pattern pt1 = Pattern.compile(testRegex.toString());
			result = pt1.matcher(matchStr).matches();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
}
