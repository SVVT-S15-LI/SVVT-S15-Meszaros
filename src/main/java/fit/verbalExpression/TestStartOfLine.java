package fit.verbalExpression;

import java.util.regex.Pattern;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestStartOfLine extends ColumnFixture{
	String start;
	String match;
	
	public String isStartOfLine(){
		VerbalExpression testRegex = new VerbalExpression.Builder().startOfLine().add(start).build();//   (?:.*).word()
		Pattern pt1 = Pattern.compile(testRegex.toString());
		Boolean result;
		try{
			 result = pt1.matcher(match).matches();
		}catch(Exception e){
			return "ERROR";
		}
    	return String.valueOf(result);
	}
}
