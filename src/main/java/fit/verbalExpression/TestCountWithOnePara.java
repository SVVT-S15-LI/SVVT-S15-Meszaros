package fit.verbalExpression;

import java.util.regex.Pattern;

import fit.ColumnFixture;
import verbalExpression.VerbalExpression;

public class TestCountWithOnePara extends ColumnFixture{
	 
	String pValue;
	String match;
	String count;
	Boolean result;
		
		public String isCountWithOnePara(){
			String matchStr = null;
			String pValueStr = null;
			if(match!=null){
				matchStr = match;
			}
			if(pValue!=null){
				pValueStr = pValue;
			}
			try{
				VerbalExpression regex = VerbalExpression.regex().find(pValueStr).count(Integer.parseInt(count)).build();			
				Pattern pt1 = Pattern.compile(regex.toString());
				result = pt1.matcher(matchStr).matches();
			}catch(Exception e){
				return "ERROR";
			}
				return String.valueOf(result);
		}
}
