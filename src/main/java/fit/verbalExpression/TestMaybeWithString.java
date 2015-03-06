package fit.verbalExpression;

import java.util.regex.Pattern;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestMaybeWithString extends ColumnFixture{
	String add;
	String match;

	public String isMaybe(){
		Boolean result;
		String str = null;
		String matchStr = null;
		if(add!=null){
			str = add;
		}
		if(match!=null){
			matchStr = match;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().add(matchStr.substring(0, matchStr.length()-str.length())).maybe(str).build();						
			Pattern pt1 = Pattern.compile(testRegex.toString());
			result = pt1.matcher(matchStr).find();
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
	
}
