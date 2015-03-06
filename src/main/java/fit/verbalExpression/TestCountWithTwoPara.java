package fit.verbalExpression;

import java.util.regex.Pattern;

import fit.ColumnFixture;
import verbalExpression.VerbalExpression;

public class TestCountWithTwoPara extends ColumnFixture{
	String pValue;
	String match;
	String count1;
	String count2;
	Boolean result;
		
		public String isCountWithTwoPara(){
			String matchStr = null;
			String pValueStr = null;
			if(match!=null){
				matchStr = match;
			}
			if(pValue!=null){
				pValueStr = pValue;
			}
			try{
				VerbalExpression regex =  new VerbalExpression.Builder().add(pValueStr).count(Integer.parseInt(count1), Integer.parseInt(count2)).build();			
				Pattern pt1 = Pattern.compile(regex.toString());
				result = pt1.matcher(matchStr).find();
			}catch(Exception e){
				return "ERROR";
			}
				return String.valueOf(result);
		}
}
