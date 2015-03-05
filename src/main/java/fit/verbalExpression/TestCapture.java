package fit.verbalExpression;

import java.util.regex.Pattern;

import fit.ColumnFixture;
import verbalExpression.VerbalExpression;

public class TestCapture extends ColumnFixture{
	String pValue;
	String match;
	Boolean result;
	
	public String isCapture(){
		String matchStr = null;
		String pValueStr = null;
		if(match!=null){
			matchStr = match;
		}
		if(pValue!=null){
			pValueStr = pValue;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().anything().capture().find(pValueStr).anything().build();//   (?:.*).word()
            Pattern pt1 = Pattern.compile(testRegex.toString());
            result = pt1.matcher(matchStr).matches();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
}
