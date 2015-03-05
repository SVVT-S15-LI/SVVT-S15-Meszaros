package fit.verbalExpression;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestGetTextWithTwoPara extends ColumnFixture{
	String input1;
	String input2;
	String group;
	String match;
	Boolean result;
	
	public String isText(){
		String matchStr = null;
		String input1Str = null;
		String input2Str = null;
		
		if(match!=null){
			matchStr = match;
		}
		if(input1!=null){
			input1Str = input1;
		}
		if(input2!=null){
			input2Str = input2;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().find(input1Str).anything().capture().find(input2Str).build();			
			return testRegex.getText(matchStr, Integer.parseInt(group));
		}catch(Exception e){
			return "ERROR";
		}
	}
}
