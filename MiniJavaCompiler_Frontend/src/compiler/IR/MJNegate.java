package compiler.IR;

import compiler.PrettyPrinter;

public class MJNegate extends MJUnaryOp {
	
	private MJExpression condition;

	public MJNegate(){}
	
	public MJNegate(MJExpression condition){
		
		this.condition = condition;
	}
	
	public MJExpression getCondition(){
		return condition;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("!");
		this.condition.prettyPrint(prepri);
	}
}
