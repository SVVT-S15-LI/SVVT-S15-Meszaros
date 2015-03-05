package fit.verbalExpression;

import java.util.regex.Pattern;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestEndCapture extends ColumnFixture{
	String input;
	String match;
	Boolean result;
	
	public String isEndCapture(){
		String matchStr = null;
		String inputStr = null;
		if(match!=null){
			matchStr = match;
		}
		if(input!=null){
			inputStr = input;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder()
            .capture().find(inputStr).anything().endCapture().build();

			Pattern pt1 = Pattern.compile(testRegex.toString());
        	result = pt1.matcher(matchStr).matches();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
}
