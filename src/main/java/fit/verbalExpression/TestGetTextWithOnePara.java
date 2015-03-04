package fit.verbalExpression;

import fit.ColumnFixture;
import verbalExpression.VerbalExpression;

public class TestGetTextWithOnePara extends ColumnFixture{
	String pValue;
	String match;
	Boolean result;
	
	public String isText(){
		String matchStr = null;
		String pValueStr = null;
		if(match!=null){
			matchStr = match;
		}
		if(pValue!=null){
			pValueStr = pValue;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().find(pValueStr).build();			
			return testRegex.getText(matchStr);
		}catch(Exception e){
			return "ERROR";
		}
	}
}
