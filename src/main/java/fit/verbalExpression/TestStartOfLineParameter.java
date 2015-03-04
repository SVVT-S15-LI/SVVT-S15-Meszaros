package fit.verbalExpression;

import java.util.regex.Pattern;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestStartOfLineParameter extends ColumnFixture{
	String enable;
	String start;
	String match;
	
	public String isStartOfLine(){
		boolean Benable;
		if(enable.equals("T")){
			Benable = true;
		}else{
			Benable = false;
		}
		VerbalExpression testRegex = new VerbalExpression.Builder().startOfLine(Benable).add(start).build();//   (?:.*).word()
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
