package compiler.IR;

import compiler.PrettyPrinter;

public class MJWhile extends MJStatement {
	
	private MJExpression condition;
	private MJStatement statement;

	public MJWhile(){}
	
	public MJWhile(MJExpression condition, MJStatement statement){
		
		this.condition = condition;
		this.statement = statement;
	}
	
	public MJExpression getCondition(){
		return condition;
	}
	public MJStatement getStatement(){
		return statement;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("while (");
		this.condition.prettyPrint(prepri);
		prepri.print(")");
		this.statement.prettyPrint(prepri);
		
	}
}
