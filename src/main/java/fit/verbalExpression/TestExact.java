package fit.verbalExpression;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestExact extends ColumnFixture{
	String pValue;
	String match;
	Boolean result;
	public String isExact(){
		String matchStr = null;
		String pValueStr = null;
		if(match!=null){
			matchStr = match;
		}
		if(pValue!=null){
			pValueStr = pValue;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().somethingButNot(pValueStr).build();					
			result = testRegex.testExact(matchStr);
		}catch(Exception e){
			return "ERROR";
		}
			return result.toString();
	}
}
