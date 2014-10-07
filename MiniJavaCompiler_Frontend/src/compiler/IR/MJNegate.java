package compiler.IR;

import compiler.PrettyPrinter;

public class MJNegate extends MJUnaryOp {
	
	private MJExpression argument;

	public MJNegate(){}
	
	public MJNegate(MJExpression argument){
		
		this.argument = argument;
	}
	
	public MJExpression getCondition(){
		return argument;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("!");
		this.argument.prettyPrint(prepri);
	}
}
