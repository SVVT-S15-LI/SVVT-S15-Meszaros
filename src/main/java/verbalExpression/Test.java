package verbalExpression;

public class Test {
	String pValue;
	String match;
	Boolean result;
	
	public String isText(){
		String matchStr = null;
		String pValueStr = null;
		if(match!=null){
			matchStr = match;
		}
		if(pValue!=null){
			pValueStr = pValue;
		}
		try{
			VerbalExpression testRegex = new VerbalExpression.Builder().find("6").build();
			System.out.println(testRegex.getText("1234566"));
			return testRegex.getText(matchStr);
		}catch(Exception e){
			return "ERROR";
		}
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test t = new Test();
//		t.pValue = "6";
//		t.match = "1234566";
//		
//		System.out.println(t.isText());
//		
		String str = "wo";
        String match = "onlyword";
        VerbalExpression testRegex = new VerbalExpression.Builder().find(str).build();
        System.out.println(testRegex.getText(match));
	}

}
