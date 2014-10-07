package compiler.IR;

import compiler.PrettyPrinter;

public class MJWhile extends MJStatement {
	
	private MJExpression condition;
	private MJStatement whileStatement;

	public MJWhile(MJExpression condition, MJStatement whilestatement){
		
		this.condition = condition;
		this.whileStatement = whilestatement;
	}
	
	public MJExpression getCondition(){
		return condition;
	}
	public MJStatement getStatement(){
		return whileStatement;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("while (");
		this.condition.prettyPrint(prepri);
		prepri.print(")");
		this.whileStatement.prettyPrint(prepri);
		
	}
}
