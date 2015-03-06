package fit.verbalExpression;

import java.util.regex.Pattern;

import verbalExpression.VerbalExpression;
import fit.ColumnFixture;

public class TestRange extends ColumnFixture{
	String str1;
	String str2;
	String match;
	Boolean result;
	
	public String isRange(){
		String matchStr = null;
		String pStr1 = null;
		String pStr2 = null;
		if(match!=null){
			matchStr = match;
		}
		if(str1!=null){
			pStr1 = str1;
		}
		if(str2!=null){
			pStr2 = str2;
		}
		try{
			VerbalExpression regex = VerbalExpression.regex().range(pStr1,pStr2).build();			
			Pattern pt1 = Pattern.compile(regex.toString());
			result = pt1.matcher(matchStr).matches();
			
		}catch(Exception e){
			return "ERROR";
		}
			return String.valueOf(result);
	}
}
