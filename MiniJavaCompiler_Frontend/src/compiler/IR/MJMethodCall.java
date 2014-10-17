package compiler.IR;

import java.util.LinkedList;

import compiler.PrettyPrinter;

public class MJMethodCall extends MJExpression {
	
	private LinkedList<MJExpression> optExpression; 
	private MJIdentifier identifier; 
	private MJExpression reqExpression; 
	
	
	public MJMethodCall(MJIdentifier identifier, MJExpression reqExpression, LinkedList<MJExpression> optExpression){
		this.identifier = identifier; 
		this.reqExpression = reqExpression; 
		this.optExpression = optExpression; 
	}
	// TODO
	public void prettyPrint(PrettyPrinter prepri) {
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
