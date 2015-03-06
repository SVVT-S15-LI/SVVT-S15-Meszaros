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
				VerbalExpression testRegex = new VerbalExpression.Builder().add(pValueStr).count(Integer.parseInt(count)).build();			
				Pattern pt1 = Pattern.compile(testRegex.toString());
				result = pt1.matcher(matchStr).find();
			}catch(Exception e){
				return "ERROR";
			}
				return String.valueOf(result);
		}
}
