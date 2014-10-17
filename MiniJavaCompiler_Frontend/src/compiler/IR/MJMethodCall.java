package compiler.IR;

import java.util.LinkedList;

import compiler.PrettyPrinter;

public class MJMethodCall extends MJExpression {
	
	private LinkedList<MJExpression> optExpression; 
	private MJIdentifier identifier; 
	private MJExpression reqExpression; 
	private String methodName;
	
	
	public MJMethodCall(MJIdentifier identifier,String methodName, MJExpression reqExpression, LinkedList<MJExpression> optExpression){
		
		this.identifier = identifier; 
		this.reqExpression = reqExpression; 
		this.optExpression = optExpression; 
		this.methodName = methodName;
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		if(identifier!=null){
			this.identifier.prettyPrint(prepri);
		}
		prepri.print(methodName + "(");
		if(reqExpression!=null){
			this.reqExpression.prettyPrint(prepri);
			if(optExpression.size()>0){
				for (int i = 0; i <= optExpression.size();i++){
					prepri.print(",");
					this.optExpression.get(i).prettyPrint(prepri);
				}
			}
		}
		prepri.print(")");
	}

	public LinkedList<MJExpression> getOptExpression() {
		return optExpression;
	}

	public MJIdentifier getIdentifier() {
		return identifier;
	}

	public MJExpression getReqExpression() {
		return reqExpression;
	}
	
	
}
